import React, {useState} from 'react'
import "./bookDetail.css"
import { IoIosArrowUp } from 'react-icons/io'

const BookDetail = ({ isDataFound, bookData }) => {
   
    const [activeIndex, setActiveIndex] = useState([0, 0, 0]);

    const changeActiveIndex = index => {
        let newActiveIndex = [0, 0, 0];
        if (activeIndex[index] === 0) {
            newActiveIndex[index] = 1;
        }
        setActiveIndex(newActiveIndex);
    };

    return (
        <div className="container" id="container">
            {isDataFound && bookData != null ? (
                <div className="book-list">
                    {bookData.map((book, idx) => (
                        <>
                            <div
                                className="book"
                                id={`book-item-${idx + 1}`}
                                data-testid={`book-item-${idx + 1}`}
                            >
                                <div className="accordion-content">
                                    <h1>{`${idx + 1} ${book.name}`}</h1>
                                    <button
                                        className="book-toggle"
                                        id="book-toggle"
                                        data-testid="book-toggle"
                                        onClick={() => changeActiveIndex(idx)}
                                    >
                                        <IoIosArrowUp />
                                    </button>
                                </div>
                                <div className="book-author">
                                    <p>{`by ${book.author}`}</p>
                                </div>
                            </div>
                            {activeIndex[idx] && book.borrower.length > 0 ? (
                                <div className="book-children">
                                    {book.borrower.map((name, idx) => (
                                        <div className="customer" id="customer" data-testid="customer">
                                            <p>{`${name}`}</p>
                                        </div>
                                    ))}
                                </div>
                            ) : null}
                        </>

                        
                    ))}
                </div>
            ) : (
                <div
                    className="error-message"
                    data-testid="error-message"
                    id="error-message"
                    >
                        <p>No data found</p>
                </div>
            )}
        </div>
    );
}

export default BookDetail