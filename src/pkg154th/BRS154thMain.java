/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package pkg154th;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**

 @author Mark Ferguson
 */
public class BRS154thMain extends Application {

  //private String CRLF = "\n";
  private String CRLF = File.pathSeparator;

  @Override
  public void start(Stage primaryStage) {
    String s = "";
    Button btn1 = new Button();
    btn1.setText("154th BRS");
    btn1.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        load("BRS");
        runNew();
      }
    });

    Button btn2 = new Button();
    btn2.setText("4518th LIR");
    btn2.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        //runNew();
        runOld();
      }
    });

    FlowPane root = new FlowPane();
    root.getChildren().addAll(btn1, btn2);

    Scene scene = new Scene(root, 145, 25);

    primaryStage.setTitle("Select");
    primaryStage.setScene(scene);
    primaryStage.show();
//    runOld();
  }

  /**
   @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }

  private void load(String str) {
    System.out.println(str);
    String Badge = "@.png";
    String Shirt = "@.png";
    String Award = "@.png";
    switch (str) {
      case "LIR": {
        Badge = "LIR.jpg";
        Shirt = "T4518th.jpg";
        Award = "SEH.jpg";
        break;
      }
      case "BRS": {
        Badge = "BRS.jpg";
        Shirt = "T154th.png";
        Award = "MCUF.jpg";
        break;
      }
    }
    System.out.println("Badge" + " = " + Badge);
    System.out.println("Shirt" + " = " + Shirt);
    System.out.println("Award" + " = " + Award);

  }

  private void runOld() {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg154th.BRS154thMain.runOld()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        //s += "" + " = " + "" + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.print(s);
      }
    }
    //</editor-fold>
    try {
      load("LIR");
      String command = "C:/Program Files/Java/jdk1.8.0_121/bin/java -jar";
      command = "notepad.exe";
      String path = "\"C:/T5 Extra/4518th/dist/4518th.jar\"";
      URL url = new URL("file://" + path);
      String s = "";
      s = command + " " + path;
      Runtime r = Runtime.getRuntime();
      System.out.println("s" + " = " + s);
      Process p = r.exec(s);
    } catch (MalformedURLException ex) {
      Logger.getLogger(BRS154thMain.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(BRS154thMain.class.getName()).log(Level.SEVERE, null, ex);
    } finally {

    }

  }

  private void runNew() {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "pkg154th.BRS154thMain.runNew()" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        //s += "" + " = " + "" + CRLF;
        //s += "" + " = " + "" + CRLF;
        System.out.print(s);
      }
    }
    //</editor-fold>

  }
}
//<editor-fold defaultstate="collapsed" desc="154th BRS">
/*
 1 Commodore (Admiral), 154th Battle Rider Squadron.
 2 Vice Commodore (Captain), 154th Battle Rider Squadron.
 3 Flag Aide (Lieutenant), 154th Battle Rider Squadron.
 4 Captain (Captain), BCF Shurduu, 154th Battle Rider Squadron.
 5 Executive Officer (Commander), BCF Shurduu, 154th Battle Rider Squadron.
 6 Astrogator (Lt Commander), BCF Shurduu, 154th Battle Rider Squadron.
 7 Chief of Operations (Commander), BCF Shurduu, 154th Battle Rider Squadron.
 8 Chief of Sensors (Lt Commander), BCF Shurduu, 154th Battle Rider Squadron.
 9 Chief of Engineering (Lt Commander), BCF Shurduu, 154th Battle Rider
 Squadron.
 10 Chief of Weapons (Commander), BCF Shurduu, 154th Battle Rider Squadron.
 11 Chief of Supply (Lt Commander), BCF Shurduu, 154th Battle Rider Squadron.
 12 Counsellor (Lt Commander), BCF Shurduu, 154th Battle Rider Squadron.
 13 Captain (Commander), BR Agu, 154th Battle Rider Squadron.
 14 Executive Officer (Lt Commander), BR Agu, 154th Battle Rider Squadron.
 15 Chief Pilot (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 16 Second Pilot (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 17 Third Pilot (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 18 Chief Astrogator (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 19 Second Astrogator (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 20 Third Astrogator (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 21 Chief Engineer (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 22 Second Engineer Jump (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 23 Third Engineer Maneuver (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 24 Power Engineer (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 25 Chief Sensor (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 26 Second Sensop (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 27 Third Sensop (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 28 Spinal Weapons Officer (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 29 Protective Battery Officer (Lieutenant), BR Agu, 154th Battle Rider
 Squadron.
 30 Ship’s Doctor (Lieutenant), BR Agu, 154th Battle Rider Squadron.
 31 Captain (Commander), BR Iirba, 154th Battle Rider Squadron.
 32 Executive Officer (Lt Commander), BR Iirba, 154th Battle Rider Squadron.
 33 Chief Pilot (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 34 Second Pilot (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 35 Third Pilot (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 36 Chief Astrogator (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 37 Second Astrogator (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 38 Third Astrogator (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 39 Chief Engineer (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 40 Second Engineer Jump (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 41 Third Engineer Maneuver (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 42 Power Engineer (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 43 Chief Sensor (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 44 Second Sensop (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 45 Third Sensop (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 46 Spinal Weapons Officer (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 47 Protective Battery Officer (Lieutenant), BR Iirba, 154th Battle Rider
 Squadron.
 48 Ship’s Doctor (Lieutenant), BR Iirba, 154th Battle Rider Squadron.
 49 Captain (Commander), BR Lannur, 154th Battle Rider Squadron.
 50 Executive Officer (Lt Commander), BR Lannur, 154th Battle Rider Squadron.
 51 Chief Pilot (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 52 Second Pilot (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 53 Third Pilot (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 54 Chief Astrogator (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 55 Second Astrogator (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 56 Third Astrogator (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 57 Chief Engineer (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 58 Second Engineer Jump (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 59 Third Engineer Maneuver (Lieutenant), BR Lannur, 154th Battle Rider
 Squadron.
 60 Power Engineer (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 61 Chief Sensor (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 62 Second Sensop (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 63 Third Sensop (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 64 Spinal Weapons Officer (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 65 Protective Battery Officer (Lieutenant), BR Lannur, 154th Battle Rider
 Squadron.
 66 Ship’s Doctor (Lieutenant), BR Lannur, 154th Battle Rider Squadron.
 67 Captain (Commander), BR Ledur, 154th Battle Rider Squadron.
 68 Executive Officer (Lt Commander), BR Ledur, 154th Battle Rider Squadron.
 69 Chief Pilot (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 70 Second Pilot (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 71 Third Pilot (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 72 Chief Astrogator (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 73 Second Astrogator (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 74 Third Astrogator (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 75 Chief Engineer (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 76 Second Engineer Jump (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 77 Third Engineer Maneuver (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 78 Power Engineer (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 79 Chief Sensor (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 80 Second Sensop (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 81 Third Sensop (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 82 Spinal Weapons Officer (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 83 Protective Battery Officer (Lieutenant), BR Ledur, 154th Battle Rider
 Squadron.
 84 Ship’s Doctor (Lieutenant), BR Ledur, 154th Battle Rider Squadron.
 85 Captain (Commander), BR Lindikir, 154th Battle Rider Squadron.
 86 Executive Officer (Lt Commander), BR Lindikir, 154th Battle Rider Squadron.
 87 Chief Pilot (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 88 Second Pilot (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 89 Third Pilot (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 90 Chief Astrogator (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 91 Second Astrogator (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 92 Third Astrogator (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 93 Chief Engineer (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 94 Second Engineer Jump (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 95 Third Engineer Maneuver (Lieutenant), BR Lindikir, 154th Battle Rider
 Squadron.
 96 Power Engineer (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 97 Chief Sensor (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 98 Second Sensop (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 99 Third Sensop (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 100 Spinal Weapons Officer (Lieutenant), BR Lindikir, 154th Battle Rider
 Squadron.
 101 Protective Battery Officer (Lieutenant), BR Lindikir, 154th Battle Rider
 Squadron.
 102 Ship’s Doctor (Lieutenant), BR Lindikir, 154th Battle Rider Squadron.
 103 Captain (Commander), BR Galek, 154th Battle Rider Squadron.
 104 Executive Officer (Lt Commander), BR Galek, 154th Battle Rider Squadron.
 105 Chief Pilot (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 106 Second Pilot (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 107 Third Pilot (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 108 Chief Astrogator (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 109 Second Astrogator (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 110 Third Astrogator (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 111 Chief Engineer (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 112 Second Engineer Jump (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 113 Third Engineer Maneuver (Lieutenant), BR Galek, 154th Battle Rider
 Squadron.
 114 Power Engineer (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 115 Chief Sensor (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 116 Second Sensop (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 117 Third Sensop (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 118 Spinal Weapons Officer (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 119 Protective Battery Officer (Lieutenant), BR Galek, 154th Battle Rider
 Squadron.
 120 Ship’s Doctor (Lieutenant), BR Galek, 154th Battle Rider Squadron.
 121 Captain (Commander), BR Akinnina, 154th Battle Rider Squadron.
 122 Executive Officer (Lt Commander), BR Akinnina, 154th Battle Rider Squadron.
 123 Chief Pilot (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 124 Second Pilot (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 125 Third Pilot (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 126 Chief Astrogator (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 127 Second Astrogator (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 128 Third Astrogator (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 129 Chief Engineer (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 130 Second Engineer Jump (Lieutenant), BR Akinnina, 154th Battle Rider
 Squadron.
 131 Third Engineer Maneuver (Lieutenant), BR Akinnina, 154th Battle Rider
 Squadron.
 132 Power Engineer (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 133 Chief Sensor (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 134 Second Sensop (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 135 Third Sensop (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 136 Spinal Weapons Officer (Lieutenant), BR Akinnina, 154th Battle Rider
 Squadron.
 137 Protective Battery Officer (Lieutenant), BR Akinnina, 154th Battle Rider
 Squadron.
 138 Ship’s Doctor (Lieutenant), BR Akinnina, 154th Battle Rider Squadron.
 139 Captain (Lt Commander), FE Rowley, 154th Battle Rider Squadron.
 140 Executive Officer (Lieutenant), FE Rowley, 154th Battle Rider Squadron.
 141 Pilot (Lieutenant), FE Rowley, 154th Battle Rider Squadron.
 142 Astrogator (Lieutenant), FE Rowley, 154th Battle Rider Squadron.
 143 Engineer (Lieutenant), FE Rowley, 154th Battle Rider Squadron.
 144 Second Engineer (Lieutenant), FE Rowley, 154th Battle Rider Squadron.
 145 Sensop (Lieutenant), FE Rowley, 154th Battle Rider Squadron.
 146 Gunnery (Lieutenant), FE Rowley, 154th Battle Rider Squadron.
 147 Doctor (Lieutenant), FE Rowley, 154th Battle Rider Squadron.
 148 Cutter Pilot (Lieutenant), FE Rowley, 154th Battle Rider Squadron.
 149 Captain (Lt Commander), FE Dickson, 154th Battle Rider Squadron.
 150 Executive Officer (Lieutenant), FE Dickson, 154th Battle Rider Squadron.
 151 Pilot (Lieutenant), FE Dickson, 154th Battle Rider Squadron.
 152 Astrogator (Lieutenant), FE Dickson, 154th Battle Rider Squadron.
 153 Engineer (Lieutenant), FE Dickson, 154th Battle Rider Squadron.
 154 Second Engineer (Lieutenant), FE Dickson, 154th Battle Rider Squadron.
 155 Sensop (Lieutenant), FE Dickson, 154th Battle Rider Squadron.
 156 Gunnery (Lieutenant), FE Dickson, 154th Battle Rider Squadron.
 157 Doctor (Lieutenant), FE Dickson, 154th Battle Rider Squadron.
 158 Cutter Pilot (Lieutenant), FE Dickson, 154th Battle Rider Squadron.
 159 Captain (Lt Commander), FE Palmer, 154th Battle Rider Squadron.
 160 Executive Officer (Lieutenant), FE Palmer, 154th Battle Rider Squadron.
 161 Pilot (Lieutenant), FE Palmer, 154th Battle Rider Squadron.
 162 Astrogator (Lieutenant), FE Palmer, 154th Battle Rider Squadron.
 163 Engineer (Lieutenant), FE Palmer, 154th Battle Rider Squadron.
 164 Second Engineer (Lieutenant), FE Palmer, 154th Battle Rider Squadron.
 165 Sensop (Lieutenant), FE Palmer, 154th Battle Rider Squadron.
 166 Gunnery (Lieutenant), FE Palmer, 154th Battle Rider Squadron.
 167 Doctor (Lieutenant), FE Palmer, 154th Battle Rider Squadron.
 168 Cutter Pilot (Lieutenant), FE Palmer, 154th Battle Rider Squadron.
 169 Captain (Lt Commander), FE Holmes, 154th Battle Rider Squadron.
 170 Executive Officer (Lieutenant), FE Holmes, 154th Battle Rider Squadron.
 171 Pilot (Lieutenant), FE Holmes, 154th Battle Rider Squadron.
 172 Astrogator (Lieutenant), FE Holmes, 154th Battle Rider Squadron.
 173 Engineer (Lieutenant), FE Holmes, 154th Battle Rider Squadron.
 174 Second Engineer (Lieutenant), FE Holmes, 154th Battle Rider Squadron.
 175 Sensop (Lieutenant), FE Holmes, 154th Battle Rider Squadron.
 176 Gunnery (Lieutenant), FE Holmes, 154th Battle Rider Squadron.
 177 Doctor (Lieutenant), FE Holmes, 154th Battle Rider Squadron.
 178 Cutter Pilot (Lieutenant), FE Holmes, 154th Battle Rider Squadron.
 179 Captain (Lt Commander), FE Stewart, 154th Battle Rider Squadron.
 180 Executive Officer (Lieutenant), FE Stewart, 154th Battle Rider Squadron.
 181 Pilot (Lieutenant), FE Stewart, 154th Battle Rider Squadron.
 182 Astrogator (Lieutenant), FE Stewart, 154th Battle Rider Squadron.
 183 Engineer (Lieutenant), FE Stewart, 154th Battle Rider Squadron.
 184 Second Engineer (Lieutenant), FE Stewart, 154th Battle Rider Squadron.
 185 Sensop (Lieutenant), FE Stewart, 154th Battle Rider Squadron.
 186 Gunnery (Lieutenant), FE Stewart, 154th Battle Rider Squadron.
 187 Doctor (Lieutenant), FE Stewart, 154th Battle Rider Squadron.
 188 Cutter Pilot (Lieutenant), FE Stewart, 154th Battle Rider Squadron.
 189 Captain (Lt Commander), FE Warren, 154th Battle Rider Squadron.
 190 Executive Officer (Lieutenant), FE Warren, 154th Battle Rider Squadron.
 191 Pilot (Lieutenant), FE Warren, 154th Battle Rider Squadron.
 192 Astrogator (Lieutenant), FE Warren, 154th Battle Rider Squadron.
 193 Engineer (Lieutenant), FE Warren, 154th Battle Rider Squadron.
 194 Second Engineer (Lieutenant), FE Warren, 154th Battle Rider Squadron.
 195 Sensop (Lieutenant), FE Warren, 154th Battle Rider Squadron.
 196 Gunnery (Lieutenant), FE Warren, 154th Battle Rider Squadron.
 197 Doctor (Lieutenant), FE Warren, 154th Battle Rider Squadron.
 198 Cutter Pilot (Lieutenant), FE Warren, 154th Battle Rider Squadron.
 199 Captain (Lt Commander), FE Baldwin, 154th Battle Rider Squadron.
 200 Executive Officer (Lieutenant), FE Baldwin, 154th Battle Rider Squadron.
 201 Pilot (Lieutenant), FE Baldwin, 154th Battle Rider Squadron.
 202 Astrogator (Lieutenant), FE Baldwin, 154th Battle Rider Squadron.
 203 Engineer (Lieutenant), FE Baldwin, 154th Battle Rider Squadron.
 204 Second Engineer (Lieutenant), FE Baldwin, 154th Battle Rider Squadron.
 205 Sensop (Lieutenant), FE Baldwin, 154th Battle Rider Squadron.
 206 Gunnery (Lieutenant), FE Baldwin, 154th Battle Rider Squadron.
 207 Doctor (Lieutenant), FE Baldwin, 154th Battle Rider Squadron.
 208 Cutter Pilot (Lieutenant), FE Baldwin, 154th Battle Rider Squadron.
 209 Fighter Group Commander (Captain), 154th Heavy Fighter Group, 154th BR
 Squadron.
 210 Operations Officer (Commander), 154th Heavy Fighter Group, 154th BR
 Squadron.
 211 Flight Surgeon (Lt Commander), 154th Heavy Fighter Group, 154th BR
 Squadron.
 212 Chief of Maintenance (Commander), 154th Heavy Fighter Group, 154th BR
 Squadron.
 213 Fighter Squadron Commander (Commander), 1st Fighter Squadron 154 HFG, 154th
 BR Sqdrn.
 214 Planning Officer (Lt Commander), 1st Fighter Squadron 154 HFG, 154th BR
 Squadron.
 215 Fighter Flight Commander (Lt Commander), Fighter 1 Flight 1, 1st Fighter
 Squadron 154 HFG.
 216 Weapons Officer (Lieutenant), Fighter 1 Flight 1, 1st Fighter Squadron 154
 HFG.
 217 First Element Leader (Lieutenant), Fighter 2 Flight 1, 1st Fighter Squadron
 154 HFG.
 218 Weapons Officer (Lieutenant), Fighter 2 Flight 1, 1st Fighter Squadron 154
 HFG.
 219 Port Wingone (Lieutenant), Fighter 3 Flight 1, 1st Fighter Squadron 154
 HFG.
 220 Weapons Officer (Lieutenant), Fighter 3 Flight 1, 1st Fighter Squadron 154
 HFG.
 221 Starboard Wingone (Lieutenant), Fighter 4 Flight 1, 1st Fighter Squadron
 154 HFG.
 222 Weapons Officer (Lieutenant), Fighter 4 Flight 1, 1st Fighter Squadron 154
 HFG.
 223 Second Element Leader (Lieutenant), Fighter 5 Flight 1, 1st Fighter
 Squadron 154 HFG.
 224 Weapons Officer (Lieutenant), Fighter 5 Flight 1, 1st Fighter Squadron 154
 HFG.
 225 Port Wingone (Lieutenant), Fighter 6 Flight 1, 1st Fighter Squadron 154
 HFG.
 226 Weapons Officer (Lieutenant), Fighter 6 Flight 1, 1st Fighter Squadron 154
 HFG.
 227 Starboard Wingone (Lieutenant), Fighter 7 Flight 1, 1st Fighter Squadron
 154 HFG.
 228 Weapons Officer (Lieutenant), Fighter 7 Flight 1, 1st Fighter Squadron 154
 HFG.
 229 Third Element Leader (Lieutenant), Fighter 8 Flight 1, 1st Fighter Squadron
 154 HFG.
 230 Weapons Officer (Lieutenant), Fighter 8 Flight 1, 1st Fighter Squadron 154
 HFG.
 231 Port Wingone (Lieutenant), Fighter 9 Flight 1, 1st Fighter Squadron 154
 HFG.
 232 Weapons Officer (Lieutenant), Fighter 9 Flight 1, 1st Fighter Squadron 154
 HFG.
 233 Starboard Wingone (Lieutenant), Fighter 10 Flight 1, 1st Fighter Squadron
 154 HFG.
 234 Weapons Officer (Lieutenant), Fighter 10 Flight 1, 1st Fighter Squadron 154
 HFG.
 235 Fourth Element Leader (Lieutenant), Fighter 11 Flight 1, 1st Fighter
 Squadron 154 HFG.
 236 Weapons Officer (Lieutenant), Fighter 11 Flight 1, 1st Fighter Squadron 154
 HFG.
 237 Port Wingone (Lieutenant), Fighter 12 Flight 1, 1st Fighter Squadron 154
 HFG.
 238 Weapons Officer (Lieutenant), Fighter 12 Flight 1, 1st Fighter Squadron 154
 HFG.
 239 Starboard Wingone (Lieutenant), Fighter 13 Flight 1, 1st Fighter Squadron
 154 HFG.
 240 Weapons Officer (Lieutenant), Fighter 13 Flight 1, 1st Fighter Squadron 154
 HFG.
 241 Fifth Element Leader (Lieutenant), Fighter 14 Flight 1, 1st Fighter
 Squadron 154 HFG.
 242 Weapons Officer (Lieutenant), Fighter 14 Flight 1, 1st Fighter Squadron 154
 HFG.
 243 Port Wingone (Lieutenant), Fighter 15 Flight 1, 1st Fighter Squadron 154
 HFG.
 244 Weapons Officer (Lieutenant), Fighter 15 Flight 1, 1st Fighter Squadron 154
 HFG.
 245 Starboard Wingone (Lieutenant), Fighter 16 Flight 1, 1st Fighter Squadron
 154 HFG.
 246 Weapons Officer (Lieutenant), Fighter 16 Flight 1, 1st Fighter Squadron 154
 HFG.
 247 Sixth Element Leader (Lieutenant), Fighter 17 Flight 1, 1st Fighter
 Squadron 154 HFG.
 248 Weapons Officer (Lieutenant), Fighter 17 Flight 1, 1st Fighter Squadron 154
 HFG.
 249 Port Wingone (Lieutenant), Fighter 18 Flight 1, 1st Fighter Squadron 154
 HFG.
 250 Weapons Officer (Lieutenant), Fighter 18 Flight 1, 1st Fighter Squadron 154
 HFG.
 251 Starboard Wingone (Lieutenant), Fighter 19 Flight 1, 1st Fighter Squadron
 154 HFG.
 252 Weapons Officer (Lieutenant), Fighter 19 Flight 1, 1st Fighter Squadron 154
 HFG.
 253 Lone Wolf (Lieutenant), Fighter 20 Flight 1, 1st Fighter Squadron 154 HFG.
 254 Weapons Officer (Lieutenant), Fighter 20 Flight 1, 1st Fighter Squadron 154
 HFG.
 255 Fighter Flight Commander (Lt Commander), Fighter 1 Flight 2, 1st Fighter
 Squadron 154 HFG.
 256 Weapons Officer (Lieutenant), Fighter 1 Flight 2, 1st Fighter Squadron 154
 HFG.
 257 First Element Leader (Lieutenant), Fighter 2 Flight 2, 1st Fighter Squadron
 154 HFG.
 258 Weapons Officer (Lieutenant), Fighter 2 Flight 2, 1st Fighter Squadron 154
 HFG.
 259 Port Wingone (Lieutenant), Fighter 3 Flight 2, 1st Fighter Squadron 154
 HFG.
 260 Weapons Officer (Lieutenant), Fighter 3 Flight 2, 1st Fighter Squadron 154
 HFG.
 261 Starboard Wingone (Lieutenant), Fighter 4 Flight 2, 1st Fighter Squadron
 154 HFG.
 262 Weapons Officer (Lieutenant), Fighter 4 Flight 2, 1st Fighter Squadron 154
 HFG.
 263 Second Element Leader (Lieutenant), Fighter 5 Flight 2, 1st Fighter
 Squadron 154 HFG.
 264 Weapons Officer (Lieutenant), Fighter 5 Flight 2, 1st Fighter Squadron 154
 HFG.
 265 Port Wingone (Lieutenant), Fighter 6 Flight 2, 1st Fighter Squadron 154
 HFG.
 266 Weapons Officer (Lieutenant), Fighter 6 Flight 2, 1st Fighter Squadron 154
 HFG.
 267 Starboard Wingone (Lieutenant), Fighter 7 Flight 2, 1st Fighter Squadron
 154 HFG.
 268 Weapons Officer (Lieutenant), Fighter 7 Flight 2, 1st Fighter Squadron 154
 HFG.
 269 Third Element Leader (Lieutenant), Fighter 8 Flight 2, 1st Fighter Squadron
 154 HFG.
 270 Weapons Officer (Lieutenant), Fighter 8 Flight 2, 1st Fighter Squadron 154
 HFG.
 271 Port Wingone (Lieutenant), Fighter 9 Flight 2, 1st Fighter Squadron 154
 HFG.
 272 Weapons Officer (Lieutenant), Fighter 9 Flight 2, 1st Fighter Squadron 154
 HFG.
 273 Starboard Wingone (Lieutenant), Fighter 10 Flight 2, 1st Fighter Squadron
 154 HFG.
 274 Weapons Officer (Lieutenant), Fighter 10 Flight 2, 1st Fighter Squadron 154
 HFG.
 275 Fourth Element Leader (Lieutenant), Fighter 11 Flight 2, 1st Fighter
 Squadron 154 HFG.
 276 Weapons Officer (Lieutenant), Fighter 11 Flight 2, 1st Fighter Squadron 154
 HFG.
 277 Port Wingone (Lieutenant), Fighter 12 Flight 2, 1st Fighter Squadron 154
 HFG.
 278 Weapons Officer (Lieutenant), Fighter 12 Flight 2, 1st Fighter Squadron 154
 HFG.
 279 Starboard Wingone (Lieutenant), Fighter 13 Flight 2, 1st Fighter Squadron
 154 HFG.
 280 Weapons Officer (Lieutenant), Fighter 13 Flight 2, 1st Fighter Squadron 154
 HFG.
 281 Fifth Element Leader (Lieutenant), Fighter 14 Flight 2, 1st Fighter
 Squadron 154 HFG.
 282 Weapons Officer (Lieutenant), Fighter 14 Flight 2, 1st Fighter Squadron 154
 HFG.
 283 Port Wingone (Lieutenant), Fighter 15 Flight 2, 1st Fighter Squadron 154
 HFG.
 284 Weapons Officer (Lieutenant), Fighter 15 Flight 2, 1st Fighter Squadron 154
 HFG.
 285 Starboard Wingone (Lieutenant), Fighter 16 Flight 2, 1st Fighter Squadron
 154 HFG.
 286 Weapons Officer (Lieutenant), Fighter 16 Flight 2, 1st Fighter Squadron 154
 HFG.
 287 Sixth Element Leader (Lieutenant), Fighter 17 Flight 2, 1st Fighter
 Squadron 154 HFG.
 288 Weapons Officer (Lieutenant), Fighter 17 Flight 2, 1st Fighter Squadron 154
 HFG.
 289 Port Wingone (Lieutenant), Fighter 18 Flight 2, 1st Fighter Squadron 154
 HFG.
 290 Weapons Officer (Lieutenant), Fighter 18 Flight 2, 1st Fighter Squadron 154
 HFG.
 291 Starboard Wingone (Lieutenant), Fighter 19 Flight 2, 1st Fighter Squadron
 154 HFG.
 292 Weapons Officer (Lieutenant), Fighter 19 Flight 2, 1st Fighter Squadron 154
 HFG.
 293 Lone Wolf (Lieutenant), Fighter 20 Flight 2, 1st Fighter Squadron 154 HFG.
 294 Weapons Officer (Lieutenant), Fighter 20 Flight 2, 1st Fighter Squadron 154
 HFG.
 295 Fighter Flight Commander (Lt Commander), Fighter 1 Flight 3, 1st Fighter
 Squadron 154 HFG.
 296 Weapons Officer (Lieutenant), Fighter 1 Flight 3, 1st Fighter Squadron 154
 HFG.
 297 First Element Leader (Lieutenant), Fighter 2 Flight 3, 1st Fighter Squadron
 154 HFG.
 298 Weapons Officer (Lieutenant), Fighter 2 Flight 3, 1st Fighter Squadron 154
 HFG.
 299 Port Wingone (Lieutenant), Fighter 3 Flight 3, 1st Fighter Squadron 154
 HFG.
 300 Weapons Officer (Lieutenant), Fighter 3 Flight 3, 1st Fighter Squadron 154
 HFG
 */

//</editor-fold>
