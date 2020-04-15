package views.dashboard;

import javax.swing.JPanel;
/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class CambioPanel
{
    private JPanel contenedor;
    private JPanel contenido;

    public CambioPanel(JPanel contenedor, JPanel contenido)
    {
    	this.contenedor = contenedor;
	this.contenido = contenido;
        
	this.contenedor.removeAll();
        this.contenedor.revalidate();

	this.contenedor.add(this.contenido);
	this.contenedor.revalidate();
    }
}
