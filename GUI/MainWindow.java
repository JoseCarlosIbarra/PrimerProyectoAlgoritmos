package GUI;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainWindow extends JFrame{
    
    private JDesktopPane desktopPane;
    private JMenuBar jMenuBar;
    private JMenu jmOptions;
    private JMenuItem jmiLoadList;
    private JMenuItem jmiSearchMovie;
    private JMenuItem jmiShowMovies;
    private JMenuItem jmiInsertMovie;
    private JMenuItem jmiExit;
    
    public MainWindow() {
        super();
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.desktopPane = new JDesktopPane();
        init();
    }
    
    public void init() {
        this.jMenuBar = new JMenuBar();
        this.setJMenuBar(jMenuBar);
        
        this.jmOptions = new JMenu("Opciones");
        this.jMenuBar.add(jmOptions);
        
        this.jmiLoadList = new JMenuItem("Cargar lista");
        this.jmOptions.add(jmiLoadList);
        
        this.jmiSearchMovie = new JMenuItem("Buscar película");
        this.jmOptions.add(jmiSearchMovie);
        
        this.jmiShowMovies = new JMenuItem("Mostrar todas las películas");
        this.jmOptions.add(jmiShowMovies);
        
        this.jmiInsertMovie = new JMenuItem("Registrar película");
        this.jmOptions.add(jmiInsertMovie);
        
        this.jmiExit = new JMenuItem("Salir");
        this.jmOptions.add(jmiExit);
    }
    
}
