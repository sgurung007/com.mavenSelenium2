package com.example.demo;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
@CssImport("styles/shared-style.css")
public class MainView extends VerticalLayout {
    public MainView() {
        VerticalLayout todoslist = new VerticalLayout();
        TextField taskField = new TextField();
        Button addButton = new Button("Add");
        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        addButton.addClickShortcut(Key.ENTER);
        addButton.addClickListener(buttonClickEvent -> {
            Checkbox checkbox = new Checkbox(taskField.getValue());
            todoslist.add(checkbox);
        });
        add(
                new H1("Vaadin Todo"),
                todoslist,
                new HorizontalLayout(taskField, addButton)
        );


    }
}
