import React, {useState, useEffect} from 'react'
import "./mainPage.css"
import { BookDetail, Country, ErrorMessage } from "../../components";

const MainPage = () => {
    const [countryCode, setCountryCode] = useState("");
    const [isDataFound, setIsDataFound] = useState(true);
    const [bookData, setBookData] = useState(null);

    const getRandomCountry = async () => {
        const getCountry = await fetch('http://localhost:8080/getRandomCountry');
        const result = await getCountry.json();
        return result.country.country_code;
    };

    const getTop3Data = async () => {
        let randomCountry = await getRandomCountry();
        // randomCountry = "SG";

        const response = await fetch(`http://localhost:8080/getTop3ReadBooks?country_code=${randomCountry}`);
        const top3Books = await response.json();

        if (top3Books.message === "no results" || top3Books.message === "invalid parameter") {
            setIsDataFound(false);
        } else {
            setIsDataFound(true);
            setBookData(top3Books);
        }
        setCountryCode(randomCountry);
    };
    return (
        <div>
            <Country />
            <BookDetail />
        </div>
    )
}

export default MainPage