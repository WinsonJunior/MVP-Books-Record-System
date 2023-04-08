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
        randomCountry = "ID";
        const response = await fetch(`http://localhost:8080/getTop3ReadBook?country_code=${randomCountry}`);
        const top3Books = await response.json();


        if (Object.keys(top3Books).length === 0) {
            setIsDataFound(false);
        } else {
            console.log("bookData: ", top3Books)
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