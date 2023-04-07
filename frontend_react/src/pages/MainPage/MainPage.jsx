import React, {useState} from 'react'
import "./mainPage.css"
import { BookDetail, Country} from "../../components";

const MainPage = () => {
    const [countryCode, setCountryCode] = useState("");
    const [bookData, setBookData] = useState(null);
    const [isDataFound, setIsDataFound] = useState(true);


    const getRandomizeCountry = () => {
        getTop3Data();
    };

    const getRandomCountry = async () => {
        const getCountry = await fetch('http://localhost:8080/getRandomCountry');
        const result = await getCountry.json();
        return result.country.country_code;
    };

    const getTop3Data = async () => {
        let randomCountry = await getRandomCountry();

        const response = await fetch(`http://localhost:8080/getTop3ReadBook?country_code=${randomCountry}`);
        const top3Books = await response.json();

        console.log(top3Books.message);

        if (top3Books.message === "no results") {
            setIsDataFound(false);
        } else {
            setIsDataFound(true);
            setBookData(top3Books);
        }
        setCountryCode(randomCountry);

    };
    
    return (
        <div>
            <div className="country">
                <Country 
                    countryCode={countryCode}
                    onChange={() => setCountryCode(getRandomizeCountry())}
                />
            </div>
            <div className="bookDetail">
                <BookDetail 
                    isDataFound={isDataFound}
                    bookData={bookData}
                />
            </div>
        </div>
    )
}

export default MainPage