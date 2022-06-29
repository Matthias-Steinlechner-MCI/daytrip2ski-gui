package com.example.application.views;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "homeView")
@RouteAlias(value = "")
@CssImport("./styles/views/homeView.css")
@PageTitle("Home")
public class HomeView extends VerticalLayout{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1115700137807593311L;
	
	private Div form;
    private Button btnWithAccount;
    private Button btnWoAccount;
    private Button registration;
    private Image logo;

    public HomeView(){
    	//Initialization home view - default vaadin functions
        setSizeFull(); 
		setAlignItems(Alignment.CENTER); 
		setJustifyContentMode(JustifyContentMode.CENTER);
        setClassName("home-form");
        
        //creating elements 
        form = new Div();
        form.setClassName("form-center-bottom"); //adding css class name
        logo = new Image();
        logo.setSrc("images/logo.png");
        
        
        //creating buttons
        btnWithAccount = new Button("With account");
        btnWoAccount = new Button("No account");
        registration = new Button("Registration");
        
        //adding custom style attributes on registration buttons
        registration.getElement().getStyle().set("background-color", "#f3c604");

        //adding on click function
        btnWithAccount.addClickListener(e->{
            UI.getCurrent().navigate(LoginView.class);
        });
        btnWoAccount.addClickListener(e->{
            UI.getCurrent().navigate(ResultsView.class, "test");
        });
        
        
        //adding elements in form
        form.add(new HorizontalLayout(btnWithAccount, btnWoAccount, registration));
        form.add(new HorizontalLayout());
        
        //place elements on view
        add(logo, form);
    }
}
