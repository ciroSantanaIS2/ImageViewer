package Control;

import View.UserInterface.ImageViewer;

public abstract class ImageCommand implements Command {

    private final ImageViewer viewer;

    public ImageCommand(ImageViewer viewer) {
        this.viewer = viewer;
    }

    public ImageViewer getViewer() {
        return viewer;
    }
}