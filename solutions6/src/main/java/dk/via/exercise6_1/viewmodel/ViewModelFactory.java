package dk.via.exercise6_1.viewmodel;

import dk.via.exercise6_1.model.Model;

public class ViewModelFactory {
    private final ConvertViewModel convertViewModel;
    private final LogViewModel logViewModel;

    public ViewModelFactory(Model model) {
        this.convertViewModel = new ConvertViewModel(model);
        logViewModel = new LogViewModel(model);
    }

    public ConvertViewModel getConvertViewModel() {
        return convertViewModel;
    }

    public LogViewModel getLogViewModel() {
        return logViewModel;
    }
}
