class Windows implements Dialog{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

}

class Mac implements Dialog{
    @Override
    public Button createButton(){
        return new MacButton();
    }
}