package lab7.finaltask.first.Hero;
/*
import lab7.finaltask.first.Interfaces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeroGUI extends JFrame {
    private final Hero hero;
    private int count = 0;

    public HeroGUI() {
        hero = new Hero();
        initGUI();
    }

    private void initGUI() {
        setTitle("GUI for Hero application");
        setPreferredSize(new Dimension(450, 130));
        setLocation(new Point(360, 240));

        JPanel jPanel = new JPanel();
        JLabel stat = new JLabel(hero.getStats());

        JButton forward = new JButton("Move forward");
        forward.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hero.move();
                count++;
                stat.setText(hero.getStats());
            }
        });
        JButton back = new JButton("Move back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hero.moveBack();
                count++;
                stat.setText(hero.getStats());
            }
        });

        JRadioButton stay = new JRadioButton("Stay");
        stay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hero.changeMovementStrategy(new StayInterface());
                stat.setText(hero.getStats());
            }
        });
        stay.setSelected(true);
        JRadioButton walk = new JRadioButton("Walk");
        walk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hero.changeMovementStrategy(new WalkStrategy());
                stat.setText(hero.getStats());
            }
        });
        JRadioButton run = new JRadioButton("Run");
        run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hero.changeMovementStrategy(new RunInterface());
                stat.setText(hero.getStats());
            }
        });
        JRadioButton rideHorse = new JRadioButton("Ride a Horse");
        rideHorse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hero.changeMovementStrategy(new RideAHorseInterface());
                stat.setText(hero.getStats());
            }
        });

        JButton exit = new JButton("exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "final location: " + hero.currentLocation + "\nnumber of actions: " + count;
                JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("final location: " + hero.currentLocation + "\nnumber of actions: " + count);
                System.exit(0);
            }
        });
        exit.setPreferredSize(new Dimension(430, 25));

        ButtonGroup groupActions = new ButtonGroup();
        groupActions.add(stay);
        groupActions.add(walk);
        groupActions.add(run);
        groupActions.add(rideHorse);

        jPanel.add(stat);
        jPanel.add(back);
        jPanel.add(forward);
        jPanel.add(stay);
        jPanel.add(walk);
        jPanel.add(run);
        jPanel.add(rideHorse);
        jPanel.add(exit);
        add(jPanel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

 */
