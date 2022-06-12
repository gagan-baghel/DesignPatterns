interface Subject {
	void addfollower(Observer o);

	void removefollower(Observer o);

	void snotify(String tweet);
}