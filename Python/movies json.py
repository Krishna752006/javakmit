import json

def load_database():
    try:
        with open("movies.json", "r") as file:
            return json.load(file)
    except FileNotFoundError:
        return []

def save_database(movies):
    with open("movies.json", "w") as file:
        json.dump(movies, file, indent=4)

def add_movie():
    movie_id = input("Enter Movie ID: ")
    title = input("Enter Title: ")
    director = input("Enter Director: ")
    genre = input("Enter Genre: ")
    release_year = input("Enter Release Year: ")

    movie = {
        "id": movie_id,
        "title": title,
        "director": director,
        "genre": genre,
        "release_year": release_year
    }

    movies = load_database()
    movies.append(movie)
    save_database(movies)
    print("Movie added successfully!")

def search_movie(title):
    movies = load_database()
    for movie in movies:
        if movie["title"].lower() == title.lower():
            print("Movie found:")
            print(json.dumps(movie, indent=4))
            return
    print("Movie not found.")

def display_all_movies():
    movies = load_database()
    print("List of all movies:")
    for movie in movies:
        print(json.dumps(movie, indent=4))

def update_movie(movie_id):
    movies = load_database()
    for movie in movies:
        if movie["id"] == movie_id:
            print("Update movie details:")
            movie["title"] = input("New Title: ")
            movie["director"] = input("New Director: ")
            movie["genre"] = input("New Genre: ")
            movie["release_year"] = input("New Release Year: ")
            save_database(movies)
            print("Movie details updated successfully!")
            return
    print("Movie not found.")

def delete_movie(movie_id):
    movies = load_database()
    for movie in movies:
        if movie["id"] == movie_id:
            movies.remove(movie)
            save_database(movies)
            print("Movie deleted successfully!")
            return
    print("Movie not found.")


while True:
    print("\n1. Add a new movie")
    print("2. Search for a movie by title")
    print("3. Display all movies")
    print("4. Update a movie")
    print("5. Delete a movie")
    print("6. Exit")
    choice = input("Enter your choice: ")

    if choice == "1":
        add_movie()
    elif choice == "2":
        title = input("Enter title to search: ")
        search_movie(title)
    elif choice == "3":
        display_all_movies()
    elif choice == "4":
        movie_id = input("Enter ID of the movie to update: ")
        update_movie(movie_id)
    elif choice == "5":
        movie_id = input("Enter ID of the movie to delete: ")
        delete_movie(movie_id)
    elif choice == "6":
        break
    else:
        print("Invalid choice. Please try again.")