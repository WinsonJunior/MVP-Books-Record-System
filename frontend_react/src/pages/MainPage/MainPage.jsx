import React, {useState} from 'react'
import "./mainPage.css"
import { BookDetail, Country} from "../../components";

const MainPage = () => {
    const [countryCode, setCountryCode] = useState("");
    const [bookData, setBookData] = useState(null);


    const getRandomCountry = async () => {
        const getCountry = await fetch('http://localhost:8080/getRandCountry');
        const result = await getCountry.json();
        return result.country.country_code;
    };

    const getTop3Data = async () => {
        let randomCountry = await getRandomCountry();

        const response = await fetch(`http://localhost:8080/getTop3Books?country_code=${randomCountry}`);
        const top3Books = await response.json();

        setBookData(top3Books);
        setCountryCode(randomCountry);

    };
    
    return (
        <div>
            <div className="country">
                <Country 
                    countryCode={countryCode}
                    onChange={() => setCountryCode(getTop3Data())}
                />
            </div>
            <div className="bookDetail">
                <BookDetail 
                    bookData={bookData}
                />
            </div>
        </div>
    )
}

export default MainPage