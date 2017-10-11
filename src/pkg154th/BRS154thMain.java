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
//      command = "notepad.exe";
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
 1 Commodore (Admiral), 154th Battle Rider Squadron
 2 Vice Commodore (Captain), 154th Battle Rider Squadron
 3 Flag Aide (Lieutenant), 154th Battle Rider Squadron

 5 Captain (Captain), BCF Shurduu, 154th Battle Rider Squadron
 6 Executive Officer (Commander), BCF Shurduu, 154th Battle Rider Squadron
 7 Astrogator (Lt Commander), BCF Shurduu, 154th Battle Rider Squadron
 8 Chief of Operations (Commander), BCF Shurduu, 154th Battle Rider Squadron
 9 Chief of Sensors (Lt Commander), BCF Shurduu, 154th Battle Rider Squadron
 10 Chief of Engineering (Lt Commander), BCF Shurduu, 154th Battle Rider Squadron
 11 Chief of Weapons (Commander), BCF Shurduu, 154th Battle Rider Squadron
 12 Chief of Supply (Lt Commander), BCF Shurduu, 154th Battle Rider Squadron
 13 Counsellor (Lt Commander), BCF Shurduu, 154th Battle Rider Squadron

 16 Captain (Commander), BR Agu, 154th Battle Rider Squadron
 17 Executive Officer (Lt Commander), BR Agu, 154th Battle Rider Squadron
 18 Chief Pilot (Lieutenant), BR Agu, 154th Battle Rider Squadron
 19 Second Pilot (Lieutenant), BR Agu, 154th Battle Rider Squadron
 20 Third Pilot (Lieutenant), BR Agu, 154th Battle Rider Squadron
 21 Chief Astrogator (Lieutenant), BR Agu, 154th Battle Rider Squadron
 22 Second Astrogator (Lieutenant), BR Agu, 154th Battle Rider Squadron
 23 Third Astrogator (Lieutenant), BR Agu, 154th Battle Rider Squadron
 24 Chief Engineer (Lieutenant), BR Agu, 154th Battle Rider Squadron
 25 Second Engineer Jump (Lieutenant), BR Agu, 154th Battle Rider Squadron
 26 Third Engineer Maneuver (Lieutenant), BR Agu, 154th Battle Rider Squadron
 27 Power Engineer (Lieutenant), BR Agu, 154th Battle Rider Squadron
 28 Chief Sensor (Lieutenant), BR Agu, 154th Battle Rider Squadron
 29 Second Sensop (Lieutenant), BR Agu, 154th Battle Rider Squadron
 30 Third Sensop (Lieutenant), BR Agu, 154th Battle Rider Squadron
 31 Spinal Weapons Officer (Lieutenant), BR Agu, 154th Battle Rider Squadron
 32 Protective Battery Officer (Lieutenant), BR Agu, 154th Battle Rider Squadron
 33 Ship's Doctor (Lieutenant), BR Agu, 154th Battle Rider Squadron

 35 Captain (Commander), BR Iirba, 154th Battle Rider Squadron
 36 Executive Officer (Lt Commander), BR Iirba, 154th Battle Rider Squadron
 37 Chief Pilot (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 38 Second Pilot (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 39 Third Pilot (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 40 Chief Astrogator (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 41 Second Astrogator (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 42 Third Astrogator (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 43 Chief Engineer (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 44 Second Engineer Jump (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 45 Third Engineer Maneuver (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 46 Power Engineer (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 47 Chief Sensor (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 48 Second Sensop (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 49 Third Sensop (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 50 Spinal Weapons Officer (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 51 Protective Battery Officer (Lieutenant), BR Iirba, 154th Battle Rider Squadron
 52 Ship's Doctor (Lieutenant), BR Iirba, 154th Battle Rider Squadron

 54 Captain (Commander), BR Lannur, 154th Battle Rider Squadron
 55 Executive Officer (Lt Commander), BR Lannur, 154th Battle Rider Squadron
 56 Chief Pilot (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 57 Second Pilot (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 58 Third Pilot (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 59 Chief Astrogator (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 60 Second Astrogator (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 61 Third Astrogator (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 62 Chief Engineer (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 63 Second Engineer Jump (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 64 Third Engineer Maneuver (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 65 Power Engineer (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 66 Chief Sensor (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 67 Second Sensop (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 68 Third Sensop (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 69 Spinal Weapons Officer (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 70 Protective Battery Officer (Lieutenant), BR Lannur, 154th Battle Rider Squadron
 71 Ship's Doctor (Lieutenant), BR Lannur, 154th Battle Rider Squadron

 73 Captain (Commander), BR Ledur, 154th Battle Rider Squadron
 74 Executive Officer (Lt Commander), BR Ledur, 154th Battle Rider Squadron
 75 Chief Pilot (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 76 Second Pilot (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 77 Third Pilot (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 78 Chief Astrogator (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 79 Second Astrogator (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 80 Third Astrogator (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 81 Chief Engineer (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 82 Second Engineer Jump (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 83 Third Engineer Maneuver (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 84 Power Engineer (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 85 Chief Sensor (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 86 Second Sensop (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 87 Third Sensop (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 88 Spinal Weapons Officer (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 89 Protective Battery Officer (Lieutenant), BR Ledur, 154th Battle Rider Squadron
 90 Ship's Doctor (Lieutenant), BR Ledur, 154th Battle Rider Squadron

 92 Captain (Commander), BR Lindikir, 154th Battle Rider Squadron
 93 Executive Officer (Lt Commander), BR Lindikir, 154th Battle Rider Squadron
 94 Chief Pilot (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 95 Second Pilot (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 96 Third Pilot (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 97 Chief Astrogator (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 98 Second Astrogator (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 99 Third Astrogator (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 100 Chief Engineer (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 101 Second Engineer Jump (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 102 Third Engineer Maneuver (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 103 Power Engineer (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 104 Chief Sensor (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 105 Second Sensop (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 106 Third Sensop (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 107 Spinal Weapons Officer (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 108 Protective Battery Officer (Lieutenant), BR Lindikir, 154th Battle Rider Squadron
 109 Ship's Doctor (Lieutenant), BR Lindikir, 154th Battle Rider Squadron

 111 Captain (Commander), BR Galek, 154th Battle Rider Squadron
 112 Executive Officer (Lt Commander), BR Galek, 154th Battle Rider Squadron
 113 Chief Pilot (Lieutenant), BR Galek, 154th Battle Rider Squadron
 114 Second Pilot (Lieutenant), BR Galek, 154th Battle Rider Squadron
 115 Third Pilot (Lieutenant), BR Galek, 154th Battle Rider Squadron
 116 Chief Astrogator (Lieutenant), BR Galek, 154th Battle Rider Squadron
 117 Second Astrogator (Lieutenant), BR Galek, 154th Battle Rider Squadron
 118 Third Astrogator (Lieutenant), BR Galek, 154th Battle Rider Squadron
 119 Chief Engineer (Lieutenant), BR Galek, 154th Battle Rider Squadron
 120 Second Engineer Jump (Lieutenant), BR Galek, 154th Battle Rider Squadron
 121 Third Engineer Maneuver (Lieutenant), BR Galek, 154th Battle Rider Squadron
 122 Power Engineer (Lieutenant), BR Galek, 154th Battle Rider Squadron
 123 Chief Sensor (Lieutenant), BR Galek, 154th Battle Rider Squadron
 124 Second Sensop (Lieutenant), BR Galek, 154th Battle Rider Squadron
 125 Third Sensop (Lieutenant), BR Galek, 154th Battle Rider Squadron
 126 Spinal Weapons Officer (Lieutenant), BR Galek, 154th Battle Rider Squadron
 127 Protective Battery Officer (Lieutenant), BR Galek, 154th Battle Rider Squadron
 128 Ship's Doctor (Lieutenant), BR Galek, 154th Battle Rider Squadron

 130 Captain (Commander), BR Akinnina, 154th Battle Rider Squadron
 131 Executive Officer (Lt Commander), BR Akinnina, 154th Battle Rider Squadron
 132 Chief Pilot (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 133 Second Pilot (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 134 Third Pilot (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 135 Chief Astrogator (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 136 Second Astrogator (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 137 Third Astrogator (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 138 Chief Engineer (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 139 Second Engineer Jump (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 140 Third Engineer Maneuver (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 141 Power Engineer (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 142 Chief Sensor (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 143 Second Sensop (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 144 Third Sensop (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 145 Spinal Weapons Officer (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 146 Protective Battery Officer (Lieutenant), BR Akinnina, 154th Battle Rider Squadron
 147 Ship's Doctor (Lieutenant), BR Akinnina, 154th Battle Rider Squadron

 149 Captain (Lt Commander), FE Rowley, 154th Battle Rider Squadron
 150 Executive Officer (Lieutenant), FE Rowley, 154th Battle Rider Squadron
 151 Pilot (Lieutenant), FE Rowley, 154th Battle Rider Squadron
 152 Astrogator (Lieutenant), FE Rowley, 154th Battle Rider Squadron
 153 Engineer (Lieutenant), FE Rowley, 154th Battle Rider Squadron
 154 Second Engineer (Lieutenant), FE Rowley, 154th Battle Rider Squadron
 155 Sensop (Lieutenant), FE Rowley, 154th Battle Rider Squadron
 156 Gunnery (Lieutenant), FE Rowley, 154th Battle Rider Squadron
 157 Doctor (Lieutenant), FE Rowley, 154th Battle Rider Squadron
 158 Cutter Pilot (Lieutenant), FE Rowley, 154th Battle Rider Squadron

 160 Captain (Lt Commander), FE Dickson, 154th Battle Rider Squadron
 161 Executive Officer (Lieutenant), FE Dickson, 154th Battle Rider Squadron
 162 Pilot (Lieutenant), FE Dickson, 154th Battle Rider Squadron
 163 Astrogator (Lieutenant), FE Dickson, 154th Battle Rider Squadron
 164 Engineer (Lieutenant), FE Dickson, 154th Battle Rider Squadron
 165 Second Engineer (Lieutenant), FE Dickson, 154th Battle Rider Squadron
 166 Sensop (Lieutenant), FE Dickson, 154th Battle Rider Squadron
 167 Gunnery (Lieutenant), FE Dickson, 154th Battle Rider Squadron
 168 Doctor (Lieutenant), FE Dickson, 154th Battle Rider Squadron
 169 Cutter Pilot (Lieutenant), FE Dickson, 154th Battle Rider Squadron

 171 Captain (Lt Commander), FE Palmer, 154th Battle Rider Squadron
 172 Executive Officer (Lieutenant), FE Palmer, 154th Battle Rider Squadron
 173 Pilot (Lieutenant), FE Palmer, 154th Battle Rider Squadron
 174 Astrogator (Lieutenant), FE Palmer, 154th Battle Rider Squadron
 175 Engineer (Lieutenant), FE Palmer, 154th Battle Rider Squadron
 176 Second Engineer (Lieutenant), FE Palmer, 154th Battle Rider Squadron
 177 Sensop (Lieutenant), FE Palmer, 154th Battle Rider Squadron
 178 Gunnery (Lieutenant), FE Palmer, 154th Battle Rider Squadron
 179 Doctor (Lieutenant), FE Palmer, 154th Battle Rider Squadron
 180 Cutter Pilot (Lieutenant), FE Palmer, 154th Battle Rider Squadron

 182 Captain (Lt Commander), FE Holmes, 154th Battle Rider Squadron
 183 Executive Officer (Lieutenant), FE Holmes, 154th Battle Rider Squadron
 184 Pilot (Lieutenant), FE Holmes, 154th Battle Rider Squadron
 185 Astrogator (Lieutenant), FE Holmes, 154th Battle Rider Squadron
 186 Engineer (Lieutenant), FE Holmes, 154th Battle Rider Squadron
 187 Second Engineer (Lieutenant), FE Holmes, 154th Battle Rider Squadron
 188 Sensop (Lieutenant), FE Holmes, 154th Battle Rider Squadron
 189 Gunnery (Lieutenant), FE Holmes, 154th Battle Rider Squadron
 190 Doctor (Lieutenant), FE Holmes, 154th Battle Rider Squadron
 191 Cutter Pilot (Lieutenant), FE Holmes, 154th Battle Rider Squadron

 193 Captain (Lt Commander), FE Stewart, 154th Battle Rider Squadron
 194 Executive Officer (Lieutenant), FE Stewart, 154th Battle Rider Squadron
 195 Pilot (Lieutenant), FE Stewart, 154th Battle Rider Squadron
 196 Astrogator (Lieutenant), FE Stewart, 154th Battle Rider Squadron
 197 Engineer (Lieutenant), FE Stewart, 154th Battle Rider Squadron
 198 Second Engineer (Lieutenant), FE Stewart, 154th Battle Rider Squadron
 199 Sensop (Lieutenant), FE Stewart, 154th Battle Rider Squadron
 200 Gunnery (Lieutenant), FE Stewart, 154th Battle Rider Squadron
 201 Doctor (Lieutenant), FE Stewart, 154th Battle Rider Squadron
 202 Cutter Pilot (Lieutenant), FE Stewart, 154th Battle Rider Squadron

 204 Captain (Lt Commander), FE Warren, 154th Battle Rider Squadron
 205 Executive Officer (Lieutenant), FE Warren, 154th Battle Rider Squadron
 206 Pilot (Lieutenant), FE Warren, 154th Battle Rider Squadron
 207 Astrogator (Lieutenant), FE Warren, 154th Battle Rider Squadron
 208 Engineer (Lieutenant), FE Warren, 154th Battle Rider Squadron
 209 Second Engineer (Lieutenant), FE Warren, 154th Battle Rider Squadron
 210 Sensop (Lieutenant), FE Warren, 154th Battle Rider Squadron
 211 Gunnery (Lieutenant), FE Warren, 154th Battle Rider Squadron
 212 Doctor (Lieutenant), FE Warren, 154th Battle Rider Squadron
 213 Cutter Pilot (Lieutenant), FE Warren, 154th Battle Rider Squadron

 215 Captain (Lt Commander), FE Baldwin, 154th Battle Rider Squadron
 216 Executive Officer (Lieutenant), FE Baldwin, 154th Battle Rider Squadron
 217 Pilot (Lieutenant), FE Baldwin, 154th Battle Rider Squadron
 218 Astrogator (Lieutenant), FE Baldwin, 154th Battle Rider Squadron
 219 Engineer (Lieutenant), FE Baldwin, 154th Battle Rider Squadron
 220 Second Engineer (Lieutenant), FE Baldwin, 154th Battle Rider Squadron
 221 Sensop (Lieutenant), FE Baldwin, 154th Battle Rider Squadron
 222 Gunnery (Lieutenant), FE Baldwin, 154th Battle Rider Squadron
 223 Doctor (Lieutenant), FE Baldwin, 154th Battle Rider Squadron
 224 Cutter Pilot (Lieutenant), FE Baldwin, 154th Battle Rider Squadron
 225 Fighter Group Commander (Captain), 154th Heavy Fighter Group, 154th BR Squadron
 226 Operations Officer (Commander), 154th Heavy Fighter Group, 154th BR Squadron
 227 Flight Surgeon (Lt Commander), 154th Heavy Fighter Group, 154th BR Squadron
 228 Chief of Maintenance (Commander), 154th Heavy Fighter Group, 154th BR Squadron

 230 Fighter Squadron Commander (Commander), 1st Fighter Squadron 154 HFG, 154th BR Squadron
 231 Planning Officer (Lt Commander), 1st Fighter Squadron 154 HFG, 154th BR Squadron




 236 Fighter Flight Commander (Lt Commander), Fighter 1 Flight 1, 1st Fighter Squadron 154 HFG
 237 Weapons Officer (Lieutenant), Fighter 1 Flight 1, 1st Fighter Squadron 154 HFG
 238 First Element Leader (Lieutenant), Fighter 2 Flight 1, 1st Fighter Squadron 154 HFG
 239 Weapons Officer (Lieutenant), Fighter 2 Flight 1, 1st Fighter Squadron 154 HFG
 240 Port Wingone (Lieutenant), Fighter 3 Flight 1, 1st Fighter Squadron 154 HFG
 241 Weapons Officer (Lieutenant), Fighter 3 Flight 1, 1st Fighter Squadron 154 HFG
 242 Starboard Wingone (Lieutenant), Fighter 4 Flight 1, 1st Fighter Squadron 154 HFG
 243 Weapons Officer (Lieutenant), Fighter 4 Flight 1, 1st Fighter Squadron 154 HFG
 244 Second Element Leader (Lieutenant), Fighter 5 Flight 1, 1st Fighter Squadron 154 HFG
 245 Weapons Officer (Lieutenant), Fighter 5 Flight 1, 1st Fighter Squadron 154 HFG
 246 Port Wingone (Lieutenant), Fighter 6 Flight 1, 1st Fighter Squadron 154 HFG
 247 Weapons Officer (Lieutenant), Fighter 6 Flight 1, 1st Fighter Squadron 154 HFG
 248 Starboard Wingone (Lieutenant), Fighter 7 Flight 1, 1st Fighter Squadron 154 HFG
 249 Weapons Officer (Lieutenant), Fighter 7 Flight 1, 1st Fighter Squadron 154 HFG
 250 Third Element Leader (Lieutenant), Fighter 8 Flight 1, 1st Fighter Squadron 154 HFG
 251 Weapons Officer (Lieutenant), Fighter 8 Flight 1, 1st Fighter Squadron 154 HFG
 252 Port Wingone (Lieutenant), Fighter 9 Flight 1, 1st Fighter Squadron 154 HFG
 253 Weapons Officer (Lieutenant), Fighter 9 Flight 1, 1st Fighter Squadron 154 HFG
 254 Starboard Wingone (Lieutenant), Fighter 10 Flight 1, 1st Fighter Squadron 154 HFG
 255 Weapons Officer (Lieutenant), Fighter 10 Flight 1, 1st Fighter Squadron 154 HFG
 256 Fourth Element Leader (Lieutenant), Fighter 11 Flight 1, 1st Fighter Squadron 154 HFG
 257 Weapons Officer (Lieutenant), Fighter 11 Flight 1, 1st Fighter Squadron 154 HFG
 258 Port Wingone (Lieutenant), Fighter 12 Flight 1, 1st Fighter Squadron 154 HFG
 259 Weapons Officer (Lieutenant), Fighter 12 Flight 1, 1st Fighter Squadron 154 HFG
 260 Starboard Wingone (Lieutenant), Fighter 13 Flight 1, 1st Fighter Squadron 154 HFG
 261 Weapons Officer (Lieutenant), Fighter 13 Flight 1, 1st Fighter Squadron 154 HFG
 262 Fifth Element Leader (Lieutenant), Fighter 14 Flight 1, 1st Fighter Squadron 154 HFG
 263 Weapons Officer (Lieutenant), Fighter 14 Flight 1, 1st Fighter Squadron 154 HFG
 264 Port Wingone (Lieutenant), Fighter 15 Flight 1, 1st Fighter Squadron 154 HFG
 265 Weapons Officer (Lieutenant), Fighter 15 Flight 1, 1st Fighter Squadron 154 HFG
 266 Starboard Wingone (Lieutenant), Fighter 16 Flight 1, 1st Fighter Squadron 154 HFG
 267 Weapons Officer (Lieutenant), Fighter 16 Flight 1, 1st Fighter Squadron 154 HFG
 268 Sixth Element Leader (Lieutenant), Fighter 17 Flight 1, 1st Fighter Squadron 154 HFG
 269 Weapons Officer (Lieutenant), Fighter 17 Flight 1, 1st Fighter Squadron 154 HFG
 270 Port Wingone (Lieutenant), Fighter 18 Flight 1, 1st Fighter Squadron 154 HFG
 271 Weapons Officer (Lieutenant), Fighter 18 Flight 1, 1st Fighter Squadron 154 HFG
 272 Starboard Wingone (Lieutenant), Fighter 19 Flight 1, 1st Fighter Squadron 154 HFG
 273 Weapons Officer (Lieutenant), Fighter 19 Flight 1, 1st Fighter Squadron 154 HFG
 274 Lone Wolf (Lieutenant), Fighter 20 Flight 1, 1st Fighter Squadron 154 HFG
 275 Weapons Officer (Lieutenant), Fighter 20 Flight 1, 1st Fighter Squadron 154 HFG

 276 Fighter Flight Commander (Lt Commander), Fighter 1 Flight 2, 1st Fighter Squadron 154 HFG
 277 Weapons Officer (Lieutenant), Fighter 1 Flight 2, 1st Fighter Squadron 154 HFG
 278 First Element Leader (Lieutenant), Fighter 2 Flight 2, 1st Fighter Squadron 154 HFG
 279 Weapons Officer (Lieutenant), Fighter 2 Flight 2, 1st Fighter Squadron 154 HFG
 280 Port Wingone (Lieutenant), Fighter 3 Flight 2, 1st Fighter Squadron 154 HFG
 281 Weapons Officer (Lieutenant), Fighter 3 Flight 2, 1st Fighter Squadron 154 HFG
 282 Starboard Wingone (Lieutenant), Fighter 4 Flight 2, 1st Fighter Squadron 154 HFG
 283 Weapons Officer (Lieutenant), Fighter 4 Flight 2, 1st Fighter Squadron 154 HFG
 284 Second Element Leader (Lieutenant), Fighter 5 Flight 2, 1st Fighter Squadron 154 HFG
 285 Weapons Officer (Lieutenant), Fighter 5 Flight 2, 1st Fighter Squadron 154 HFG
 286 Port Wingone (Lieutenant), Fighter 6 Flight 2, 1st Fighter Squadron 154 HFG
 287 Weapons Officer (Lieutenant), Fighter 6 Flight 2, 1st Fighter Squadron 154 HFG
 288 Starboard Wingone (Lieutenant), Fighter 7 Flight 2, 1st Fighter Squadron 154 HFG
 289 Weapons Officer (Lieutenant), Fighter 7 Flight 2, 1st Fighter Squadron 154 HFG
 290 Third Element Leader (Lieutenant), Fighter 8 Flight 2, 1st Fighter Squadron 154 HFG
 291 Weapons Officer (Lieutenant), Fighter 8 Flight 2, 1st Fighter Squadron 154 HFG
 292 Port Wingone (Lieutenant), Fighter 9 Flight 2, 1st Fighter Squadron 154 HFG
 293 Weapons Officer (Lieutenant), Fighter 9 Flight 2, 1st Fighter Squadron 154 HFG
 294 Starboard Wingone (Lieutenant), Fighter 10 Flight 2, 1st Fighter Squadron 154 HFG
 295 Weapons Officer (Lieutenant), Fighter 10 Flight 2, 1st Fighter Squadron 154 HFG
 296 Fourth Element Leader (Lieutenant), Fighter 11 Flight 2, 1st Fighter Squadron 154 HFG
 297 Weapons Officer (Lieutenant), Fighter 11 Flight 2, 1st Fighter Squadron 154 HFG
 298 Port Wingone (Lieutenant), Fighter 12 Flight 2, 1st Fighter Squadron 154 HFG
 299 Weapons Officer (Lieutenant), Fighter 12 Flight 2, 1st Fighter Squadron 154 HFG
 300 Starboard Wingone (Lieutenant), Fighter 13 Flight 2, 1st Fighter Squadron 154 HFG
 301 Weapons Officer (Lieutenant), Fighter 13 Flight 2, 1st Fighter Squadron 154 HFG
 302 Fifth Element Leader (Lieutenant), Fighter 14 Flight 2, 1st Fighter Squadron 154 HFG
 303 Weapons Officer (Lieutenant), Fighter 14 Flight 2, 1st Fighter Squadron 154 HFG
 304 Port Wingone (Lieutenant), Fighter 15 Flight 2, 1st Fighter Squadron 154 HFG
 305 Weapons Officer (Lieutenant), Fighter 15 Flight 2, 1st Fighter Squadron 154 HFG
 306 Starboard Wingone (Lieutenant), Fighter 16 Flight 2, 1st Fighter Squadron 154 HFG
 307 Weapons Officer (Lieutenant), Fighter 16 Flight 2, 1st Fighter Squadron 154 HFG
 308 Sixth Element Leader (Lieutenant), Fighter 17 Flight 2, 1st Fighter Squadron 154 HFG
 309 Weapons Officer (Lieutenant), Fighter 17 Flight 2, 1st Fighter Squadron 154 HFG
 310 Port Wingone (Lieutenant), Fighter 18 Flight 2, 1st Fighter Squadron 154 HFG
 311 Weapons Officer (Lieutenant), Fighter 18 Flight 2, 1st Fighter Squadron 154 HFG
 312 Starboard Wingone (Lieutenant), Fighter 19 Flight 2, 1st Fighter Squadron 154 HFG
 313 Weapons Officer (Lieutenant), Fighter 19 Flight 2, 1st Fighter Squadron 154 HFG
 314 Lone Wolf (Lieutenant), Fighter 20 Flight 2, 1st Fighter Squadron 154 HFG
 315 Weapons Officer (Lieutenant), Fighter 20 Flight 2, 1st Fighter Squadron 154 HFG

 316 Fighter Flight Commander (Lt Commander), Fighter 1 Flight 3, 1st Fighter Squadron 154 HFG
 317 Weapons Officer (Lieutenant), Fighter 1 Flight 3, 1st Fighter Squadron 154 HFG
 318 First Element Leader (Lieutenant), Fighter 2 Flight 3, 1st Fighter Squadron 154 HFG
 319 Weapons Officer (Lieutenant), Fighter 2 Flight 3, 1st Fighter Squadron 154 HFG
 320 Port Wingone (Lieutenant), Fighter 3 Flight 3, 1st Fighter Squadron 154 HFG
 321 Weapons Officer (Lieutenant), Fighter 3 Flight 3, 1st Fighter Squadron 154 HFG
 322 Starboard Wingone (Lieutenant), Fighter 4 Flight 3, 1st Fighter Squadron 154 HFG
 323 Weapons Officer (Lieutenant), Fighter 4 Flight 3, 1st Fighter Squadron 154 HFG
 324 Second Element Leader (Lieutenant), Fighter 5 Flight 3, 1st Fighter Squadron 154 HFG
 325 Weapons Officer (Lieutenant), Fighter 5 Flight 3, 1st Fighter Squadron 154 HFG
 326 Port Wingone (Lieutenant), Fighter 6 Flight 3, 1st Fighter Squadron 154 HFG
 327 Weapons Officer (Lieutenant), Fighter 6 Flight 3, 1st Fighter Squadron 154 HFG
 328 Starboard Wingone (Lieutenant), Fighter 7 Flight 3, 1st Fighter Squadron 154 HFG
 329 Weapons Officer (Lieutenant), Fighter 7 Flight 3, 1st Fighter Squadron 154 HFG
 330 Third Element Leader (Lieutenant), Fighter 8 Flight 3, 1st Fighter Squadron 154 HFG
 331 Weapons Officer (Lieutenant), Fighter 8 Flight 3, 1st Fighter Squadron 154 HFG
 332 Port Wingone (Lieutenant), Fighter 9 Flight 3, 1st Fighter Squadron 154 HFG
 333 Weapons Officer (Lieutenant), Fighter 9 Flight 3, 1st Fighter Squadron 154 HFG
 334 Starboard Wingone (Lieutenant), Fighter 10 Flight 3, 1st Fighter Squadron 154 HFG
 335 Weapons Officer (Lieutenant), Fighter 10 Flight 3, 1st Fighter Squadron 154 HFG
 336 Fourth Element Leader (Lieutenant), Fighter 11 Flight 3, 1st Fighter Squadron 154 HFG
 337 Weapons Officer (Lieutenant), Fighter 11 Flight 3, 1st Fighter Squadron 154 HFG
 338 Port Wingone (Lieutenant), Fighter 12 Flight 3, 1st Fighter Squadron 154 HFG
 339 Weapons Officer (Lieutenant), Fighter 12 Flight 3, 1st Fighter Squadron 154 HFG
 340 Starboard Wingone (Lieutenant), Fighter 13 Flight 3, 1st Fighter Squadron 154 HFG
 341 Weapons Officer (Lieutenant), Fighter 13 Flight 3, 1st Fighter Squadron 154 HFG
 342 Fifth Element Leader (Lieutenant), Fighter 14 Flight 3, 1st Fighter Squadron 154 HFG
 343 Weapons Officer (Lieutenant), Fighter 14 Flight 3, 1st Fighter Squadron 154 HFG
 344 Port Wingone (Lieutenant), Fighter 15 Flight 3, 1st Fighter Squadron 154 HFG
 345 Weapons Officer (Lieutenant), Fighter 15 Flight 3, 1st Fighter Squadron 154 HFG
 346 Starboard Wingone (Lieutenant), Fighter 16 Flight 3, 1st Fighter Squadron 154 HFG
 347 Weapons Officer (Lieutenant), Fighter 16 Flight 3, 1st Fighter Squadron 154 HFG
 348 Sixth Element Leader (Lieutenant), Fighter 17 Flight 3, 1st Fighter Squadron 154 HFG
 349 Weapons Officer (Lieutenant), Fighter 17 Flight 3, 1st Fighter Squadron 154 HFG
 350 Port Wingone (Lieutenant), Fighter 18 Flight 3, 1st Fighter Squadron 154 HFG
 351 Weapons Officer (Lieutenant), Fighter 18 Flight 3, 1st Fighter Squadron 154 HFG
 352 Starboard Wingone (Lieutenant), Fighter 19 Flight 3, 1st Fighter Squadron 154 HFG
 353 Weapons Officer (Lieutenant), Fighter 19 Flight 3, 1st Fighter Squadron 154 HFG
 354 Lone Wolf (Lieutenant), Fighter 20 Flight 3, 1st Fighter Squadron 154 HFG
 355 Weapons Officer (Lieutenant), Fighter 20 Flight 3, 1st Fighter Squadron 154 HFG

 356 Fighter Flight Commander (Lt Commander), Fighter 1 Flight 4, 1st Fighter Squadron 154 HFG
 357 Weapons Officer (Lieutenant), Fighter 1 Flight 4, 1st Fighter Squadron 154 HFG
 358 First Element Leader (Lieutenant), Fighter 2 Flight 4, 1st Fighter Squadron 154 HFG
 359 Weapons Officer (Lieutenant), Fighter 2 Flight 4, 1st Fighter Squadron 154 HFG
 360 Port Wingone (Lieutenant), Fighter 3 Flight 4, 1st Fighter Squadron 154 HFG
 361 Weapons Officer (Lieutenant), Fighter 3 Flight 4, 1st Fighter Squadron 154 HFG
 362 Starboard Wingone (Lieutenant), Fighter 4 Flight 4, 1st Fighter Squadron 154 HFG
 363 Weapons Officer (Lieutenant), Fighter 4 Flight 4, 1st Fighter Squadron 154 HFG
 364 Second Element Leader (Lieutenant), Fighter 5 Flight 4, 1st Fighter Squadron 154 HFG
 365 Weapons Officer (Lieutenant), Fighter 5 Flight 4, 1st Fighter Squadron 154 HFG
 366 Port Wingone (Lieutenant), Fighter 6 Flight 4, 1st Fighter Squadron 154 HFG
 367 Weapons Officer (Lieutenant), Fighter 6 Flight 4, 1st Fighter Squadron 154 HFG
 368 Starboard Wingone (Lieutenant), Fighter 7 Flight 4, 1st Fighter Squadron 154 HFG
 369 Weapons Officer (Lieutenant), Fighter 7 Flight 4, 1st Fighter Squadron 154 HFG
 370 Third Element Leader (Lieutenant), Fighter 8 Flight 4, 1st Fighter Squadron 154 HFG
 371 Weapons Officer (Lieutenant), Fighter 8 Flight 4, 1st Fighter Squadron 154 HFG
 372 Port Wingone (Lieutenant), Fighter 9 Flight 4, 1st Fighter Squadron 154 HFG
 373 Weapons Officer (Lieutenant), Fighter 9 Flight 4, 1st Fighter Squadron 154 HFG
 374 Starboard Wingone (Lieutenant), Fighter 10 Flight 4, 1st Fighter Squadron 154 HFG
 375 Weapons Officer (Lieutenant), Fighter 10 Flight 4, 1st Fighter Squadron 154 HFG
 376 Fourth Element Leader (Lieutenant), Fighter 11 Flight 4, 1st Fighter Squadron 154 HFG
 377 Weapons Officer (Lieutenant), Fighter 11 Flight 4, 1st Fighter Squadron 154 HFG
 378 Port Wingone (Lieutenant), Fighter 12 Flight 4, 1st Fighter Squadron 154 HFG
 379 Weapons Officer (Lieutenant), Fighter 12 Flight 4, 1st Fighter Squadron 154 HFG
 380 Starboard Wingone (Lieutenant), Fighter 13 Flight 4, 1st Fighter Squadron 154 HFG
 381 Weapons Officer (Lieutenant), Fighter 13 Flight 4, 1st Fighter Squadron 154 HFG
 382 Fifth Element Leader (Lieutenant), Fighter 14 Flight 4, 1st Fighter Squadron 154 HFG
 383 Weapons Officer (Lieutenant), Fighter 14 Flight 4, 1st Fighter Squadron 154 HFG
 384 Port Wingone (Lieutenant), Fighter 15 Flight 4, 1st Fighter Squadron 154 HFG
 385 Weapons Officer (Lieutenant), Fighter 15 Flight 4, 1st Fighter Squadron 154 HFG
 386 Starboard Wingone (Lieutenant), Fighter 16 Flight 4, 1st Fighter Squadron 154 HFG
 387 Weapons Officer (Lieutenant), Fighter 16 Flight 4, 1st Fighter Squadron 154 HFG
 388 Sixth Element Leader (Lieutenant), Fighter 17 Flight 4, 1st Fighter Squadron 154 HFG
 389 Weapons Officer (Lieutenant), Fighter 17 Flight 4, 1st Fighter Squadron 154 HFG
 390 Port Wingone (Lieutenant), Fighter 18 Flight 4, 1st Fighter Squadron 154 HFG
 391 Weapons Officer (Lieutenant), Fighter 18 Flight 4, 1st Fighter Squadron 154 HFG
 392 Starboard Wingone (Lieutenant), Fighter 19 Flight 4, 1st Fighter Squadron 154 HFG
 393 Weapons Officer (Lieutenant), Fighter 19 Flight 4, 1st Fighter Squadron 154 HFG
 394 Lone Wolf (Lieutenant), Fighter 20 Flight 4, 1st Fighter Squadron 154 HFG
 395 Weapons Officer (Lieutenant), Fighter 20 Flight 4, 1st Fighter Squadron 154 HFG

 396 Fighter Flight Commander (Lt Commander), Fighter 1 Flight 5, 1st FighterSquadron 154 HFG
 397 Weapons Officer (Lieutenant), Fighter 1 Flight 5, 1st Fighter Squadron 154 HFG
 398 First Element Leader (Lieutenant), Fighter 2 Flight 5, 1st Fighter Squadron 154 HFG
 399 Weapons Officer (Lieutenant), Fighter 2 Flight 5, 1st Fighter Squadron 154 HFG
 400 Port Wingone (Lieutenant), Fighter 3 Flight 5, 1st Fighter Squadron 154 HFG
 401 Weapons Officer (Lieutenant), Fighter 3 Flight 5, 1st Fighter Squadron 154 HFG
 402 Starboard Wingone (Lieutenant), Fighter 4 Flight 5, 1st Fighter Squadron 154 HFG
 03 Weapons Officer (Lieutenant), Fighter 4 Flight 5, 1st Fighter Squadron 154 HFG
 404 Second Element Leader (Lieutenant), Fighter 5 Flight 5, 1st Fighter Squadron 154 HFG
 405 Weapons Officer (Lieutenant), Fighter 5 Flight 5, 1st Fighter Squadron 154 HFG
 406 Port Wingone (Lieutenant), Fighter 6 Flight 5, 1st Fighter Squadron 154 HFG
 407 Weapons Officer (Lieutenant), Fighter 6 Flight 5, 1st Fighter Squadron 154 HFG
 408 Starboard Wingone (Lieutenant), Fighter 7 Flight 5, 1st Fighter Squadron 154 HFG
 409 Weapons Officer (Lieutenant), Fighter 7 Flight 5, 1st Fighter Squadron 154 HFG
 410 Third Element Leader (Lieutenant), Fighter 8 Flight 5, 1st Fighter Squadron 154 HFG
 411 Weapons Officer (Lieutenant), Fighter 8 Flight 5, 1st Fighter Squadron 154 HFG
 412 Port Wingone (Lieutenant), Fighter 9 Flight 5, 1st Fighter Squadron 154 HFG
 413 Weapons Officer (Lieutenant), Fighter 9 Flight 5, 1st Fighter Squadron 154 HFG
 414 Starboard Wingone (Lieutenant), Fighter 10 Flight 5, 1st Fighter Squadron 154 HFG
 415 Weapons Officer (Lieutenant), Fighter 10 Flight 5, 1st Fighter Squadron 154 HFG
 416 Fourth Element Leader (Lieutenant), Fighter 11 Flight 5, 1st Fighter Squadron 154 HFG
 417 Weapons Officer (Lieutenant), Fighter 11 Flight 5, 1st Fighter Squadron 154 HFG
 418 Port Wingone (Lieutenant), Fighter 12 Flight 5, 1st Fighter Squadron 154 HFG
 419 Weapons Officer (Lieutenant), Fighter 12 Flight 5, 1st Fighter Squadron 154 HFG
 420 Starboard Wingone (Lieutenant), Fighter 13 Flight 5, 1st Fighter Squadron 154 HFG
 421 Weapons Officer (Lieutenant), Fighter 13 Flight 5, 1st Fighter Squadron 154 HFG
 422 Fifth Element Leader (Lieutenant), Fighter 14 Flight 5, 1st Fighter Squadron 154 HFG
 423 Weapons Officer (Lieutenant), Fighter 14 Flight 5, 1st Fighter Squadron 154 HFG
 424 Port Wingone (Lieutenant), Fighter 15 Flight 5, 1st Fighter Squadron 154 HFG
 425 Weapons Officer (Lieutenant), Fighter 15 Flight 5, 1st Fighter Squadron 154 HFG
 426 Starboard Wingone (Lieutenant), Fighter 16 Flight 5, 1st Fighter Squadron 154 HFG
 427 Weapons Officer (Lieutenant), Fighter 16 Flight 5, 1st Fighter Squadron 154 HFG
 428 Sixth Element Leader (Lieutenant), Fighter 17 Flight 5, 1st Fighter Squadron 154 HFG
 429 Weapons Officer (Lieutenant), Fighter 17 Flight 5, 1st Fighter Squadron 154 HFG
 430 Port Wingone (Lieutenant), Fighter 18 Flight 5, 1st Fighter Squadron 154 HFG
 431 Weapons Officer (Lieutenant), Fighter 18 Flight 5, 1st Fighter Squadron 154 HFG
 432 Starboard Wingone (Lieutenant), Fighter 19 Flight 5, 1st Fighter Squadron 154 HFG
 433 Weapons Officer (Lieutenant), Fighter 19 Flight 5, 1st Fighter Squadron 154 HFG
 434 Lone Wolf (Lieutenant), Fighter 20 Flight 5, 1st Fighter Squadron 154 HFG
 435 Weapons Officer (Lieutenant), Fighter 20 Flight 5, 1st Fighter Squadron 154 HFG
 */
//</editor-fold>
