
    import { initializeApp } from "https://www.gstatic.com/firebasejs/9.21.0/firebase-app.js";

    const firebaseConfig = {
    apiKey: "AIzaSyAaS3xROolYg3L52gzlpGB5sNh767PKeqg",
    authDomain: "mediamarkt-87e16.firebaseapp.com",
    databaseURL: "https://mediamarkt-87e16-default-rtdb.firebaseio.com",
    projectId: "mediamarkt-87e16",
    storageBucket: "mediamarkt-87e16.appspot.com",
    messagingSenderId: "1030181747159",
    appId: "1:1030181747159:web:263fd23d6bfd07b60bf392",
    measurementId: "G-BLP34HE0HP"
    };

    // Initialize Firebase
    const app = initializeApp(firebaseConfig);
    import {getDatabase, ref, set, child, update, remove}
    from "https://www.gstatic.com/firebasejs/9.21.0/firebase-database.js";

    const db = getDatabase();

    // Refereces

    var email = document.getElementById("email");
    var password = document.getElementById("password");
    var username = document.getElementById("username");

    var Insbtn = document.getElementById("Insbtn");
    var Selbtn = document.getElementById("Selbtn");
    var Updbtn = document.getElementById("Updbtn");
    var Delbtn = document.getElementById("Delbtn");

    function InsertData(){
        set(ref(db, "Students/" + username.value), {
            email:email.value,
            password:password.value,
            username:username.value
        })
            .then(()=>{
                alert("data stored success")
            })
            .catch((error)=>{
                alert("data stored success")
            });
    }
    Insbtn.addEventListener('click', InsertData);




// function save(){
//     const email = document.getElementById('email').value;
//     const password = document.getElementById('password').value;
//     const username = document.getElementById('username').value;
//     const say_something = document.getElementById('say_something').value;
//     const favourite_food = document.getElementById('favourite_food').value;
//
//     database.ref('users/' + username).set({
//         email: email,
//         password: password,
//         username: username,
//         say_something: say_something,
//         favourite_food: favourite_food
//     })
//
//     alert('Saved')
// }

