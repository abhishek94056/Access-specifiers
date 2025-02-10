The Package is folder inside "SRC" folder.

The package is mainly used to hold together logically related classes.

We can create n packages in SRC folder but we can not create nested packages.

We can create n classes in any package.

The default package is created by the System.

The default package never has name.

The Package declaration is the very first line written in any class which tells which package this class belongs to.

We can NOT write package declaration for the classes in the default package.

We MUST write package declaration for the classes in the user-defined package.

In case of using a class A in class B where A and B are from different packages, we need to import the required class. 
In another words, if A and B belong to same package, we don't need to import them.

The Access Specifier is the one who specifies the access of the data.

There are total 4 access specifiers in Java.
1. public
2. private
3. protected
4. default
For example: 
	public int a;
	private int b;
	protected int c;
	int d;

Level 1: Owner
Level 2: Child in same package
Level 3: Child in another package
Level 4: Stranger in same package
Level 5: Stranger in another package

public: Any one can access

private: Only owner can access

default: All in same package can access. No one in another package can access.

protected: All in same package can access. Only child class can access in another package. Non-child/Strangers in another package can not access
