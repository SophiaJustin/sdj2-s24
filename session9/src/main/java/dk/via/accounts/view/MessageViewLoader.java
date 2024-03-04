package dk.via.accounts.view;

import dk.via.accounts.viewmodel.ViewModelFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Region;

public class MessageViewLoader extends ViewLoader {
    private final ViewHandler viewHandler;
    private final ViewModelFactory viewModelFactory;

    public MessageViewLoader(String fxml, ViewHandler viewHandler, ViewModelFactory viewModelFactory) {
        super(fxml);
        this.viewHandler = viewHandler;
        this.viewModelFactory = viewModelFactory;
    }

    @Override
    protected ViewController createViewController(FXMLLoader loader, Region root) {
        MessageViewController viewController = loader.getController();
        viewController.init(viewHandler, viewModelFactory.getMessageViewModel(), root);
        return viewController;
    }
}
