import React from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

    const showBook = true;
    const showBlog = true;
    const showCourse = false;

    // Element Variable
    let courseComponent = null;

    if (showCourse) {
        courseComponent = <CourseDetails />;
    }

    return (
        <div>

            <h1>Blogger Application</h1>

            {/* 1. if...else */}
            {
                showBook
                    ? <BookDetails />
                    : <h3>No Book Details</h3>
            }

            <hr />

            {/* 2. Logical AND */}
            {
                showBlog && <BlogDetails />
            }

            <hr />

            {/* 3. Element Variable */}
            {
                courseComponent
            }

        </div>
    );
}

export default App;