            package p000;

            import android.net.Uri;
            import android.os.Handler;
            import android.os.Looper;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            
/* 5367 */  public final class IIlOoolol0ll implements i0Ii0I1ll {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;
                public Object I00l0I0l0lO1;
                public Object I00l0OO0IO;
                public Object I00li1OI;

                public IIlOoolol0ll() {
                    String str;
                    String str2;
                    String str3;
/* 4 */             this.I00iOIl = 1;
/* 175 */           this.I00iiI = O1Oii0O0loo.I0000Il00O(lOoOiIo.I00000oIO("lnot", "neg"), lOoOiIo.I00000oIO("land", "wedge"), lOoOiIo.I00000oIO("lor", "vee"), lOoOiIo.I00000oIO("ne", "neq"), lOoOiIo.I00000oIO("le", "leq"), lOoOiIo.I00000oIO("ge", "geq"), lOoOiIo.I00000oIO("lbrace", "{"), lOoOiIo.I00000oIO("rbrace", "}"), lOoOiIo.I00000oIO("Vert", "|"), lOoOiIo.I00000oIO("gets", "leftarrow"), lOoOiIo.I00000oIO("to", "rightarrow"), lOoOiIo.I00000oIO("iff", "Longleftrightarrow"), lOoOiIo.I00000oIO("AA", "angstrom"));
/* 297 */           String str4 = "downarrow";
/* 301 */           String str5 = "↓";
/* 345 */           String str6 = "Updownarrow";
/* 431 */           HashMap mapI0000Il00O = O1Oii0O0loo.I0000Il00O(lOoOiIo.I00000oIO(".", ""), lOoOiIo.I00000oIO("(", "("), lOoOiIo.I00000oIO(")", ")"), lOoOiIo.I00000oIO("[", "["), lOoOiIo.I00000oIO("]", "]"), lOoOiIo.I00000oIO("<", "〈"), lOoOiIo.I00000oIO(">", "〉"), lOoOiIo.I00000oIO("/", "/"), lOoOiIo.I00000oIO("\\", "\\"), lOoOiIo.I00000oIO("|", "|"), lOoOiIo.I00000oIO("lgroup", "⟮"), lOoOiIo.I00000oIO("rgroup", "⟯"), lOoOiIo.I00000oIO("||", "‖"), lOoOiIo.I00000oIO("Vert", "‖"), lOoOiIo.I00000oIO("vert", "|"), lOoOiIo.I00000oIO("uparrow", "↑"), lOoOiIo.I00000oIO("downarrow", "↓"), lOoOiIo.I00000oIO("updownarrow", "↕"), lOoOiIo.I00000oIO("Uparrow", "21D1"), lOoOiIo.I00000oIO("Downarrow", "21D3"), lOoOiIo.I00000oIO("Updownarrow", "21D5"), lOoOiIo.I00000oIO("backslash", "\\"), lOoOiIo.I00000oIO("rangle", "〉"), lOoOiIo.I00000oIO("langle", "〈"), lOoOiIo.I00000oIO("rbrace", "}"), lOoOiIo.I00000oIO("}", "}"), lOoOiIo.I00000oIO("{", "{"), lOoOiIo.I00000oIO("lbrace", "{"), lOoOiIo.I00000oIO("lceil", "⌈"), lOoOiIo.I00000oIO("rceil", "⌉"), lOoOiIo.I00000oIO("lfloor", "⌊"), lOoOiIo.I00000oIO("rfloor", "⌋"));
/* 435 */           this.I00iiO = mapI0000Il00O;
/* 442 */           this.I00iio = new HashMap();
/* 448 */           Iterator it = mapI0000Il00O.entrySet().iterator();
/* 456 */           while (it.hasNext()) {
/* 462 */               Map.Entry entry = (Map.Entry) it.next();
/* 468 */               Iterator it2 = it;
/* 472 */               String str7 = (String) entry.getKey();
/* 478 */               String str8 = (String) entry.getValue();
/* 480 */               String str9 = str6;
/* 490 */               String str10 = (String) ((HashMap) this.I00iio).get(str8);
/* 492 */               String str11 = str5;
/* 494 */               if (str10 != null) {
/* 500 */                   str3 = str4;
/* 506 */                   if (str7.length() <= str10.length() && (str7.length() != str10.length() || str7.compareTo(str10) <= 0)) {
                            }
/* 508 */                   str6 = str9;
/* 510 */                   it = it2;
/* 512 */                   str5 = str11;
/* 514 */                   str4 = str3;
                        } else {
/* 534 */                   str3 = str4;
                        }
/* 540 */               ((HashMap) this.I00iio).put(str8, str7);
/* 508 */               str6 = str9;
/* 510 */               it = it2;
/* 512 */               str5 = str11;
/* 514 */               str4 = str3;
                    }
/* 544 */           String str12 = str6;
/* 546 */           String str13 = str5;
/* 548 */           String str14 = str4;
/* 552 */           String str15 = "grave";
/* 560 */           String str16 = "acute";
/* 568 */           String str17 = "hat";
/* 654 */           HashMap mapI0000Il00O2 = O1Oii0O0loo.I0000Il00O(lOoOiIo.I00000oIO("grave", "̀"), lOoOiIo.I00000oIO("acute", "́"), lOoOiIo.I00000oIO("hat", "̂"), lOoOiIo.I00000oIO("tilde", "̃"), lOoOiIo.I00000oIO("bar", "̄"), lOoOiIo.I00000oIO("breve", "̆"), lOoOiIo.I00000oIO("dot", "̇"), lOoOiIo.I00000oIO("ddot", "̈"), lOoOiIo.I00000oIO("check", "̌"), lOoOiIo.I00000oIO("vec", "⃗"), lOoOiIo.I00000oIO("widehat", "̂"), lOoOiIo.I00000oIO("widetilde", "̃"));
/* 658 */           this.I00ilI0I1 = mapI0000Il00O2;
/* 665 */           this.I00ilO0 = new HashMap();
/* 671 */           Iterator it3 = mapI0000Il00O2.entrySet().iterator();
/* 679 */           while (it3.hasNext()) {
/* 685 */               Map.Entry entry2 = (Map.Entry) it3.next();
/* 691 */               Iterator it4 = it3;
/* 695 */               String str18 = (String) entry2.getKey();
/* 701 */               String str19 = (String) entry2.getValue();
/* 703 */               String str20 = str17;
/* 713 */               String str21 = (String) ((HashMap) this.I00ilO0).get(str19);
/* 715 */               String str22 = str15;
/* 717 */               if (str21 != null) {
/* 723 */                   str2 = str16;
/* 729 */                   if (str18.length() <= str21.length() && (str18.length() != str21.length() || str18.compareTo(str21) <= 0)) {
                            }
/* 731 */                   str17 = str20;
/* 733 */                   it3 = it4;
/* 735 */                   str15 = str22;
/* 737 */                   str16 = str2;
                        } else {
/* 757 */                   str2 = str16;
                        }
/* 763 */               ((HashMap) this.I00ilO0).put(str19, str18);
/* 731 */               str17 = str20;
/* 733 */               it3 = it4;
/* 735 */               str15 = str22;
/* 737 */               str16 = str2;
                    }
/* 767 */           String str23 = str15;
/* 769 */           String str24 = str16;
/* 771 */           String str25 = str17;
/* 775 */           O1IoiiO0o1 o1IoiiO0o1 = O1IoiiO0o1.I00lll10;
/* 784 */           OIoi0IIoi oIoi0IIoiI00000oIO = lOoOiIo.I00000oIO("square", new O1IoOOii0Ioi(o1IoiiO0o1, (char) 9633));
/* 797 */           OIoi0IIoi oIoi0IIoiI00000oIO2 = lOoOiIo.I00000oIO("Box", new O1IoOOii0Ioi(o1IoiiO0o1, (char) 9633));
/* 810 */           OIoi0IIoi oIoi0IIoiI00000oIO3 = lOoOiIo.I00000oIO("blacksquare", new O1IoOOii0Ioi(o1IoiiO0o1, (char) 9632));
/* 816 */           O1IoiiO0o1 o1IoiiO0o12 = O1IoiiO0o1.I00iio;
/* 827 */           OIoi0IIoi oIoi0IIoiI00000oIO4 = lOoOiIo.I00000oIO("alpha", new O1IoOOii0Ioi(o1IoiiO0o12, "α"));
/* 837 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "β", "beta");
/* 847 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo2 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "γ", "gamma");
/* 857 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo3 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "δ", "delta");
/* 867 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo4 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ε", "varepsilon");
/* 877 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo5 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ζ", "zeta");
/* 887 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo6 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "η", "eta");
/* 897 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo7 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "θ", "theta");
/* 907 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo8 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ι", "iota");
/* 917 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo9 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "κ", "kappa");
/* 927 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo10 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "λ", "lambda");
/* 937 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo11 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "μ", "mu");
/* 947 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo12 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ν", "nu");
/* 957 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo13 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ξ", "xi");
/* 967 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo14 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ο", "omicron");
/* 977 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo15 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "π", "pi");
/* 987 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo16 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ρ", "rho");
/* 997 */           OIoi0IIoi oIoi0IIoiI0001Ioi1lo17 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ς", "varsigma");
/* 1007 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo18 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "σ", "sigma");
/* 1017 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo19 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "τ", "tau");
/* 1027 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo20 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "υ", "upsilon");
/* 1037 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo21 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "φ", "varphi");
/* 1047 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo22 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "χ", "chi");
/* 1057 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo23 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ψ", "psi");
/* 1067 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo24 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ω", "omega");
/* 1077 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo25 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ϑ", "vartheta");
/* 1087 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo26 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ϕ", "phi");
/* 1097 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo27 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ϖ", "varpi");
/* 1107 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo28 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ϰ", "varkappa");
/* 1117 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo29 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ϱ", "varrho");
/* 1127 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo30 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "ϵ", "epsilon");
/* 1137 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo31 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "Γ", "Gamma");
/* 1147 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo32 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "Δ", "Delta");
/* 1157 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo33 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "Θ", "Theta");
/* 1167 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo34 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "Λ", "Lambda");
/* 1177 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo35 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "Ξ", "Xi");
/* 1187 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo36 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "Π", "Pi");
/* 1197 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo37 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "Σ", "Sigma");
/* 1207 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo38 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "Υ", "Upsilon");
/* 1217 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo39 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "Φ", "Phi");
/* 1227 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo40 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "Ψ", "Psi");
/* 1237 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo41 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o12, "Ω", "Omega");
/* 1243 */          O1IoiiO0o1 o1IoiiO0o13 = O1IoiiO0o1.I00l0I0l0lO1;
/* 1248 */          OIoi0IIoi oIoi0IIoiI00000oIO5 = lOoOiIo.I00000oIO("lceil", new O1IoOOii0Ioi(o1IoiiO0o13, "⌈"));
/* 1256 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo42 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o13, "⌊", "lfloor");
/* 1262 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo43 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o13, "⟨", "langle");
/* 1266 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo44 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o13, "⟮", "lgroup");
/* 1272 */          O1IoiiO0o1 o1IoiiO0o14 = O1IoiiO0o1.I00l0OO0IO;
/* 1283 */          OIoi0IIoi oIoi0IIoiI00000oIO6 = lOoOiIo.I00000oIO("rceil", new O1IoOOii0Ioi(o1IoiiO0o14, "⌉"));
/* 1293 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo45 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o14, "⌋", "rfloor");
/* 1299 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo46 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o14, "⟩", "rangle");
/* 1303 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo47 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o14, "⟯", "rgroup");
/* 1309 */          O1IoiiO0o1 o1IoiiO0o15 = O1IoiiO0o1.I00ioIO;
/* 1320 */          OIoi0IIoi oIoi0IIoiI00000oIO7 = lOoOiIo.I00000oIO("leftarrow", new O1IoOOii0Ioi(o1IoiiO0o15, "←"));
/* 1324 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo48 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "↑", "uparrow");
/* 1332 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo49 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "→", "rightarrow");
/* 1342 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo50 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, str13, str14);
/* 1352 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo51 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "↔", "leftrightarrow");
/* 1362 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo52 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "↕", "updownarrow");
/* 1372 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo53 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "↖", "nwarrow");
/* 1382 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo54 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "↗", "nearrow");
/* 1392 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo55 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "↘", "searrow");
/* 1402 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo56 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "↙", "swarrow");
/* 1412 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo57 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "↦", "mapsto");
/* 1422 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo58 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⇐", "Leftarrow");
/* 1432 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo59 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⇑", "Uparrow");
/* 1442 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo60 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⇒", "Rightarrow");
/* 1452 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo61 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⇓", "Downarrow");
/* 1462 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo62 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⇔", "Leftrightarrow");
/* 1472 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo63 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⇕", str12);
/* 1482 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo64 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⟵", "longleftarrow");
/* 1492 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo65 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⟶", "longrightarrow");
/* 1502 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo66 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⟷", "longleftrightarrow");
/* 1512 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo67 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⟸", "Longleftarrow");
/* 1522 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo68 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⟹", "Longrightarrow");
/* 1532 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo69 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⟺", "Longleftrightarrow");
/* 1547 */          OIoi0IIoi oIoi0IIoiI00000oIO8 = lOoOiIo.I00000oIO("leq", new O1IoOOii0Ioi(o1IoiiO0o15, (char) 8804));
/* 1562 */          OIoi0IIoi oIoi0IIoiI00000oIO9 = lOoOiIo.I00000oIO("geq", new O1IoOOii0Ioi(o1IoiiO0o15, (char) 8805));
/* 1577 */          OIoi0IIoi oIoi0IIoiI00000oIO10 = lOoOiIo.I00000oIO("neq", new O1IoOOii0Ioi(o1IoiiO0o15, (char) 8800));
/* 1587 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo70 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "∈", "in");
/* 1597 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo71 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "∉", "notin");
/* 1607 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo72 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "∋", "ni");
/* 1617 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo73 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "∝", "propto");
/* 1627 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo74 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "∣", "mid");
/* 1637 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo75 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "∥", "parallel");
/* 1647 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo76 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "∼", "sim");
/* 1657 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo77 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "≃", "simeq");
/* 1667 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo78 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "≅", "cong");
/* 1677 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo79 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "≈", "approx");
/* 1687 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo80 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "≍", "asymp");
/* 1697 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo81 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "≐", "doteq");
/* 1707 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo82 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "≡", "equiv");
/* 1717 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo83 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "≪", "gg");
/* 1727 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo84 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "≫", "ll");
/* 1737 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo85 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "≺", "prec");
/* 1747 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo86 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "≻", "succ");
/* 1757 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo87 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⊂", "subset");
/* 1767 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo88 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⊃", "supset");
/* 1777 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo89 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⊆", "subseteq");
/* 1787 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo90 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⊇", "supseteq");
/* 1797 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo91 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⊏", "sqsubset");
/* 1807 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo92 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⊐", "sqsupset");
/* 1817 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo93 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⊑", "sqsubseteq");
/* 1827 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo94 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⊒", "sqsupseteq");
/* 1837 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo95 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⊧", "models");
/* 1847 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo96 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o15, "⟂", "perp");
/* 1864 */          OIoi0IIoi oIoi0IIoiI00000oIO11 = lOoOiIo.I00000oIO("times", new O1IoOOii0Ioi(O1IoiiO0o1.I00ilO0, (char) 215));
/* 1881 */          OIoi0IIoi oIoi0IIoiI00000oIO12 = lOoOiIo.I00000oIO("div", new O1IoOOii0Ioi(O1IoiiO0o1.I00ilO0, (char) 247));
/* 1887 */          O1IoiiO0o1 o1IoiiO0o16 = O1IoiiO0o1.I00ilO0;
/* 1898 */          OIoi0IIoi oIoi0IIoiI00000oIO13 = lOoOiIo.I00000oIO("pm", new O1IoOOii0Ioi(o1IoiiO0o16, "±"));
/* 1908 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo97 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "†", "dagger");
/* 1918 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo98 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "‡", "ddagger");
/* 1928 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo99 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "∓", "mp");
/* 1938 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo100 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "∖", "setminus");
/* 1948 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo101 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "∗", "ast");
/* 1958 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo102 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "∘", "circ");
/* 1968 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo103 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "∙", "bullet");
/* 1978 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo104 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "∧", "wedge");
/* 1988 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo105 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "∨", "vee");
/* 1998 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo106 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "∩", "cap");
/* 2008 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo107 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "∪", "cup");
/* 2018 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo108 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "≀", "wr");
/* 2028 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo109 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "⊎", "uplus");
/* 2038 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo110 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "⊓", "sqcap");
/* 2048 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo111 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "⊔", "sqcup");
/* 2058 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo112 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "⊕", "oplus");
/* 2068 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo113 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "⊖", "ominus");
/* 2078 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo114 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "⊗", "otimes");
/* 2088 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo115 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "⊘", "oslash");
/* 2098 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo116 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "⊙", "odot");
/* 2108 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo117 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "⋆", "star");
/* 2118 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo118 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "⋅", "cdot");
/* 2128 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo119 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o16, "⨿", "amalg");
/* 2141 */          OIoi0IIoi oIoi0IIoiI00000oIO14 = lOoOiIo.I00000oIO("log", I000lI("log", false));
/* 2156 */          OIoi0IIoi oIoi0IIoiI00000oIO15 = lOoOiIo.I00000oIO("lg", I000lI("lg", false));
/* 2171 */          OIoi0IIoi oIoi0IIoiI00000oIO16 = lOoOiIo.I00000oIO("ln", I000lI("ln", false));
/* 2186 */          OIoi0IIoi oIoi0IIoiI00000oIO17 = lOoOiIo.I00000oIO("sin", I000lI("sin", false));
/* 2201 */          OIoi0IIoi oIoi0IIoiI00000oIO18 = lOoOiIo.I00000oIO("arcsin", I000lI("arcsin", false));
/* 2216 */          OIoi0IIoi oIoi0IIoiI00000oIO19 = lOoOiIo.I00000oIO("sinh", I000lI("sinh", false));
/* 2231 */          OIoi0IIoi oIoi0IIoiI00000oIO20 = lOoOiIo.I00000oIO("cos", I000lI("cos", false));
/* 2246 */          OIoi0IIoi oIoi0IIoiI00000oIO21 = lOoOiIo.I00000oIO("arccos", I000lI("arccos", false));
/* 2261 */          OIoi0IIoi oIoi0IIoiI00000oIO22 = lOoOiIo.I00000oIO("cosh", I000lI("cosh", false));
/* 2276 */          OIoi0IIoi oIoi0IIoiI00000oIO23 = lOoOiIo.I00000oIO("tan", I000lI("tan", false));
/* 2291 */          OIoi0IIoi oIoi0IIoiI00000oIO24 = lOoOiIo.I00000oIO("arctan", I000lI("arctan", false));
/* 2306 */          OIoi0IIoi oIoi0IIoiI00000oIO25 = lOoOiIo.I00000oIO("tanh", I000lI("tanh", false));
/* 2321 */          OIoi0IIoi oIoi0IIoiI00000oIO26 = lOoOiIo.I00000oIO("cot", I000lI("cot", false));
/* 2336 */          OIoi0IIoi oIoi0IIoiI00000oIO27 = lOoOiIo.I00000oIO("coth", I000lI("coth", false));
/* 2351 */          OIoi0IIoi oIoi0IIoiI00000oIO28 = lOoOiIo.I00000oIO("sec", I000lI("sec", false));
/* 2366 */          OIoi0IIoi oIoi0IIoiI00000oIO29 = lOoOiIo.I00000oIO("csc", I000lI("csc", false));
/* 2381 */          OIoi0IIoi oIoi0IIoiI00000oIO30 = lOoOiIo.I00000oIO("arg", I000lI("arg", false));
/* 2396 */          OIoi0IIoi oIoi0IIoiI00000oIO31 = lOoOiIo.I00000oIO("ker", I000lI("ker", false));
/* 2411 */          OIoi0IIoi oIoi0IIoiI00000oIO32 = lOoOiIo.I00000oIO("dim", I000lI("dim", false));
/* 2426 */          OIoi0IIoi oIoi0IIoiI00000oIO33 = lOoOiIo.I00000oIO("hom", I000lI("hom", false));
/* 2441 */          OIoi0IIoi oIoi0IIoiI00000oIO34 = lOoOiIo.I00000oIO("exp", I000lI("exp", false));
/* 2456 */          OIoi0IIoi oIoi0IIoiI00000oIO35 = lOoOiIo.I00000oIO("deg", I000lI("deg", false));
/* 2471 */          OIoi0IIoi oIoi0IIoiI00000oIO36 = lOoOiIo.I00000oIO("lim", I000lI("lim", true));
/* 2486 */          OIoi0IIoi oIoi0IIoiI00000oIO37 = lOoOiIo.I00000oIO("limsup", I000lI("lim sup", true));
/* 2501 */          OIoi0IIoi oIoi0IIoiI00000oIO38 = lOoOiIo.I00000oIO("liminf", I000lI("lim inf", true));
/* 2516 */          OIoi0IIoi oIoi0IIoiI00000oIO39 = lOoOiIo.I00000oIO("max", I000lI("max", true));
/* 2531 */          OIoi0IIoi oIoi0IIoiI00000oIO40 = lOoOiIo.I00000oIO("min", I000lI("min", true));
/* 2546 */          OIoi0IIoi oIoi0IIoiI00000oIO41 = lOoOiIo.I00000oIO("sup", I000lI("sup", true));
/* 2561 */          OIoi0IIoi oIoi0IIoiI00000oIO42 = lOoOiIo.I00000oIO("inf", I000lI("inf", true));
/* 2576 */          OIoi0IIoi oIoi0IIoiI00000oIO43 = lOoOiIo.I00000oIO("det", I000lI("det", true));
/* 2591 */          OIoi0IIoi oIoi0IIoiI00000oIO44 = lOoOiIo.I00000oIO("Pr", I000lI("Pr", true));
/* 2606 */          OIoi0IIoi oIoi0IIoiI00000oIO45 = lOoOiIo.I00000oIO("gcd", I000lI("gcd", true));
/* 2621 */          OIoi0IIoi oIoi0IIoiI00000oIO46 = lOoOiIo.I00000oIO("prod", I000lI("∏", true));
/* 2636 */          OIoi0IIoi oIoi0IIoiI00000oIO47 = lOoOiIo.I00000oIO("coprod", I000lI("∐", true));
/* 2651 */          OIoi0IIoi oIoi0IIoiI00000oIO48 = lOoOiIo.I00000oIO("sum", I000lI("∑", true));
/* 2666 */          OIoi0IIoi oIoi0IIoiI00000oIO49 = lOoOiIo.I00000oIO("int", I000lI("∫", false));
/* 2681 */          OIoi0IIoi oIoi0IIoiI00000oIO50 = lOoOiIo.I00000oIO("oint", I000lI("∮", false));
/* 2696 */          OIoi0IIoi oIoi0IIoiI00000oIO51 = lOoOiIo.I00000oIO("bigwedge", I000lI("⋀", true));
/* 2711 */          OIoi0IIoi oIoi0IIoiI00000oIO52 = lOoOiIo.I00000oIO("bigvee", I000lI("⋁", true));
/* 2726 */          OIoi0IIoi oIoi0IIoiI00000oIO53 = lOoOiIo.I00000oIO("bigcap", I000lI("⋂", true));
/* 2741 */          OIoi0IIoi oIoi0IIoiI00000oIO54 = lOoOiIo.I00000oIO("bigcup", I000lI("⋃", true));
/* 2756 */          OIoi0IIoi oIoi0IIoiI00000oIO55 = lOoOiIo.I00000oIO("bigodot", I000lI("⨀", true));
/* 2771 */          OIoi0IIoi oIoi0IIoiI00000oIO56 = lOoOiIo.I00000oIO("bigoplus", I000lI("⨁", true));
/* 2786 */          OIoi0IIoi oIoi0IIoiI00000oIO57 = lOoOiIo.I00000oIO("bigotimes", I000lI("⨂", true));
/* 2801 */          OIoi0IIoi oIoi0IIoiI00000oIO58 = lOoOiIo.I00000oIO("biguplus", I000lI("⨄", true));
/* 2816 */          OIoi0IIoi oIoi0IIoiI00000oIO59 = lOoOiIo.I00000oIO("bigsqcup", I000lI("⨆", true));
/* 2822 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo120 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o13, "{", "{");
/* 2830 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo121 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o14, "}", "}");
/* 2840 */          O1IoiiO0o1 o1IoiiO0o17 = O1IoiiO0o1.I00iiI;
/* 2851 */          OIoi0IIoi oIoi0IIoiI00000oIO60 = lOoOiIo.I00000oIO("$", new O1IoOOii0Ioi(o1IoiiO0o17, "$"));
/* 2861 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo122 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "&", "&");
/* 2871 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo123 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "#", "#");
/* 2881 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo124 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "%", "%");
/* 2891 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo125 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "_", "_");
/* 2901 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo126 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, " ", " ");
/* 2911 */          OIoi0IIoi oIoi0IIoiI0001Ioi1lo127 = IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "\\", "backslash");
/* 2919 */          O1IoiiO0o1 o1IoiiO0o18 = O1IoiiO0o1.I00lli11;
/* 4332 */          HashMap mapI0000Il00O3 = O1Oii0O0loo.I0000Il00O(oIoi0IIoiI00000oIO, oIoi0IIoiI00000oIO2, oIoi0IIoiI00000oIO3, oIoi0IIoiI00000oIO4, oIoi0IIoiI0001Ioi1lo, oIoi0IIoiI0001Ioi1lo2, oIoi0IIoiI0001Ioi1lo3, oIoi0IIoiI0001Ioi1lo4, oIoi0IIoiI0001Ioi1lo5, oIoi0IIoiI0001Ioi1lo6, oIoi0IIoiI0001Ioi1lo7, oIoi0IIoiI0001Ioi1lo8, oIoi0IIoiI0001Ioi1lo9, oIoi0IIoiI0001Ioi1lo10, oIoi0IIoiI0001Ioi1lo11, oIoi0IIoiI0001Ioi1lo12, oIoi0IIoiI0001Ioi1lo13, oIoi0IIoiI0001Ioi1lo14, oIoi0IIoiI0001Ioi1lo15, oIoi0IIoiI0001Ioi1lo16, oIoi0IIoiI0001Ioi1lo17, oIoi0IIoiI0001Ioi1lo18, oIoi0IIoiI0001Ioi1lo19, oIoi0IIoiI0001Ioi1lo20, oIoi0IIoiI0001Ioi1lo21, oIoi0IIoiI0001Ioi1lo22, oIoi0IIoiI0001Ioi1lo23, oIoi0IIoiI0001Ioi1lo24, oIoi0IIoiI0001Ioi1lo25, oIoi0IIoiI0001Ioi1lo26, oIoi0IIoiI0001Ioi1lo27, oIoi0IIoiI0001Ioi1lo28, oIoi0IIoiI0001Ioi1lo29, oIoi0IIoiI0001Ioi1lo30, oIoi0IIoiI0001Ioi1lo31, oIoi0IIoiI0001Ioi1lo32, oIoi0IIoiI0001Ioi1lo33, oIoi0IIoiI0001Ioi1lo34, oIoi0IIoiI0001Ioi1lo35, oIoi0IIoiI0001Ioi1lo36, oIoi0IIoiI0001Ioi1lo37, oIoi0IIoiI0001Ioi1lo38, oIoi0IIoiI0001Ioi1lo39, oIoi0IIoiI0001Ioi1lo40, oIoi0IIoiI0001Ioi1lo41, oIoi0IIoiI00000oIO5, oIoi0IIoiI0001Ioi1lo42, oIoi0IIoiI0001Ioi1lo43, oIoi0IIoiI0001Ioi1lo44, oIoi0IIoiI00000oIO6, oIoi0IIoiI0001Ioi1lo45, oIoi0IIoiI0001Ioi1lo46, oIoi0IIoiI0001Ioi1lo47, oIoi0IIoiI00000oIO7, oIoi0IIoiI0001Ioi1lo48, oIoi0IIoiI0001Ioi1lo49, oIoi0IIoiI0001Ioi1lo50, oIoi0IIoiI0001Ioi1lo51, oIoi0IIoiI0001Ioi1lo52, oIoi0IIoiI0001Ioi1lo53, oIoi0IIoiI0001Ioi1lo54, oIoi0IIoiI0001Ioi1lo55, oIoi0IIoiI0001Ioi1lo56, oIoi0IIoiI0001Ioi1lo57, oIoi0IIoiI0001Ioi1lo58, oIoi0IIoiI0001Ioi1lo59, oIoi0IIoiI0001Ioi1lo60, oIoi0IIoiI0001Ioi1lo61, oIoi0IIoiI0001Ioi1lo62, oIoi0IIoiI0001Ioi1lo63, oIoi0IIoiI0001Ioi1lo64, oIoi0IIoiI0001Ioi1lo65, oIoi0IIoiI0001Ioi1lo66, oIoi0IIoiI0001Ioi1lo67, oIoi0IIoiI0001Ioi1lo68, oIoi0IIoiI0001Ioi1lo69, oIoi0IIoiI00000oIO8, oIoi0IIoiI00000oIO9, oIoi0IIoiI00000oIO10, oIoi0IIoiI0001Ioi1lo70, oIoi0IIoiI0001Ioi1lo71, oIoi0IIoiI0001Ioi1lo72, oIoi0IIoiI0001Ioi1lo73, oIoi0IIoiI0001Ioi1lo74, oIoi0IIoiI0001Ioi1lo75, oIoi0IIoiI0001Ioi1lo76, oIoi0IIoiI0001Ioi1lo77, oIoi0IIoiI0001Ioi1lo78, oIoi0IIoiI0001Ioi1lo79, oIoi0IIoiI0001Ioi1lo80, oIoi0IIoiI0001Ioi1lo81, oIoi0IIoiI0001Ioi1lo82, oIoi0IIoiI0001Ioi1lo83, oIoi0IIoiI0001Ioi1lo84, oIoi0IIoiI0001Ioi1lo85, oIoi0IIoiI0001Ioi1lo86, oIoi0IIoiI0001Ioi1lo87, oIoi0IIoiI0001Ioi1lo88, oIoi0IIoiI0001Ioi1lo89, oIoi0IIoiI0001Ioi1lo90, oIoi0IIoiI0001Ioi1lo91, oIoi0IIoiI0001Ioi1lo92, oIoi0IIoiI0001Ioi1lo93, oIoi0IIoiI0001Ioi1lo94, oIoi0IIoiI0001Ioi1lo95, oIoi0IIoiI0001Ioi1lo96, oIoi0IIoiI00000oIO11, oIoi0IIoiI00000oIO12, oIoi0IIoiI00000oIO13, oIoi0IIoiI0001Ioi1lo97, oIoi0IIoiI0001Ioi1lo98, oIoi0IIoiI0001Ioi1lo99, oIoi0IIoiI0001Ioi1lo100, oIoi0IIoiI0001Ioi1lo101, oIoi0IIoiI0001Ioi1lo102, oIoi0IIoiI0001Ioi1lo103, oIoi0IIoiI0001Ioi1lo104, oIoi0IIoiI0001Ioi1lo105, oIoi0IIoiI0001Ioi1lo106, oIoi0IIoiI0001Ioi1lo107, oIoi0IIoiI0001Ioi1lo108, oIoi0IIoiI0001Ioi1lo109, oIoi0IIoiI0001Ioi1lo110, oIoi0IIoiI0001Ioi1lo111, oIoi0IIoiI0001Ioi1lo112, oIoi0IIoiI0001Ioi1lo113, oIoi0IIoiI0001Ioi1lo114, oIoi0IIoiI0001Ioi1lo115, oIoi0IIoiI0001Ioi1lo116, oIoi0IIoiI0001Ioi1lo117, oIoi0IIoiI0001Ioi1lo118, oIoi0IIoiI0001Ioi1lo119, oIoi0IIoiI00000oIO14, oIoi0IIoiI00000oIO15, oIoi0IIoiI00000oIO16, oIoi0IIoiI00000oIO17, oIoi0IIoiI00000oIO18, oIoi0IIoiI00000oIO19, oIoi0IIoiI00000oIO20, oIoi0IIoiI00000oIO21, oIoi0IIoiI00000oIO22, oIoi0IIoiI00000oIO23, oIoi0IIoiI00000oIO24, oIoi0IIoiI00000oIO25, oIoi0IIoiI00000oIO26, oIoi0IIoiI00000oIO27, oIoi0IIoiI00000oIO28, oIoi0IIoiI00000oIO29, oIoi0IIoiI00000oIO30, oIoi0IIoiI00000oIO31, oIoi0IIoiI00000oIO32, oIoi0IIoiI00000oIO33, oIoi0IIoiI00000oIO34, oIoi0IIoiI00000oIO35, oIoi0IIoiI00000oIO36, oIoi0IIoiI00000oIO37, oIoi0IIoiI00000oIO38, oIoi0IIoiI00000oIO39, oIoi0IIoiI00000oIO40, oIoi0IIoiI00000oIO41, oIoi0IIoiI00000oIO42, oIoi0IIoiI00000oIO43, oIoi0IIoiI00000oIO44, oIoi0IIoiI00000oIO45, oIoi0IIoiI00000oIO46, oIoi0IIoiI00000oIO47, oIoi0IIoiI00000oIO48, oIoi0IIoiI00000oIO49, oIoi0IIoiI00000oIO50, oIoi0IIoiI00000oIO51, oIoi0IIoiI00000oIO52, oIoi0IIoiI00000oIO53, oIoi0IIoiI00000oIO54, oIoi0IIoiI00000oIO55, oIoi0IIoiI00000oIO56, oIoi0IIoiI00000oIO57, oIoi0IIoiI00000oIO58, oIoi0IIoiI00000oIO59, oIoi0IIoiI0001Ioi1lo120, oIoi0IIoiI0001Ioi1lo121, oIoi0IIoiI00000oIO60, oIoi0IIoiI0001Ioi1lo122, oIoi0IIoiI0001Ioi1lo123, oIoi0IIoiI0001Ioi1lo124, oIoi0IIoiI0001Ioi1lo125, oIoi0IIoiI0001Ioi1lo126, oIoi0IIoiI0001Ioi1lo127, lOoOiIo.I00000oIO("colon", new O1IoOOii0Ioi(o1IoiiO0o18, ":")), IlIi0I0.I0001Ioi1lo(o1IoiiO0o18, "·", "cdotp"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "°", "degree"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "¬", "neg"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "Å", "angstrom"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "‖", "|"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "|", "vert"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "…", "ldots"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "′", "prime"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "ℏ", "hbar"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "ℑ", "Im"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "ℓ", "ell"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "℘", "wp"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "ℜ", "Re"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "℧", "mho"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "ℵ", "aleph"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "∀", "forall"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "∃", "exists"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "∅", "emptyset"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "∇", "nabla"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "∞", "infty"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "∠", "angle"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "⊤", "top"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "⊥", "bot"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "⋮", "vdots"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "⋯", "cdots"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "⋱", "ddots"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "△", "triangle"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "♢", "diamond"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "√", "surd"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "∛", "cbrt"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "𝚤", "imath"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "𝚥", "jmath"), IlIi0I0.I0001Ioi1lo(o1IoiiO0o17, "𝜕", "partial"), lOoOiIo.I00000oIO(",", new O1O011o0(3.0f)), lOoOiIo.I00000oIO(">", new O1O011o0(4.0f)), lOoOiIo.I00000oIO(";", new O1O011o0(5.0f)), lOoOiIo.I00000oIO("!", new O1O011o0(-3.0f)), lOoOiIo.I00000oIO("quad", new O1O011o0(18.0f)), lOoOiIo.I00000oIO("qquad", new O1O011o0(36.0f)), lOoOiIo.I00000oIO("displaystyle", new O1O0IiioOiIo(O1IoI1l1IIo0.I00iOIl)), lOoOiIo.I00000oIO("textstyle", new O1O0IiioOiIo(O1IoI1l1IIo0.I00iiI)), lOoOiIo.I00000oIO("scriptstyle", new O1O0IiioOiIo(O1IoI1l1IIo0.I00iiO)), lOoOiIo.I00000oIO("scriptscriptstyle", new O1O0IiioOiIo(O1IoI1l1IIo0.I00iio)));
/* 4336 */          this.I00io1l = mapI0000Il00O3;
/* 5022 */          this.I00ioIO = O1Oii0O0loo.I0000O(IlIi0I0.I000II(str24, "a", (char) 225), IlIi0I0.I000II(str24, "e", (char) 233), IlIi0I0.I000II(str24, "i", (char) 237), IlIi0I0.I000II(str24, "o", (char) 243), IlIi0I0.I000II(str24, "u", (char) 250), IlIi0I0.I000II(str24, "y", (char) 253), IlIi0I0.I000II(str23, "a", (char) 224), IlIi0I0.I000II(str23, "e", (char) 232), IlIi0I0.I000II(str23, "i", (char) 236), IlIi0I0.I000II(str23, "o", (char) 242), IlIi0I0.I000II(str23, "u", (char) 249), IlIi0I0.I000II(str25, "a", (char) 226), IlIi0I0.I000II(str25, "e", (char) 234), IlIi0I0.I000II(str25, "i", (char) 238), IlIi0I0.I000II(str25, "o", (char) 244), IlIi0I0.I000II(str25, "u", (char) 251), IlIi0I0.I000II("ddot", "a", (char) 228), IlIi0I0.I000II("ddot", "e", (char) 235), IlIi0I0.I000II("ddot", "i", (char) 239), IlIi0I0.I000II("ddot", "o", (char) 246), IlIi0I0.I000II("ddot", "u", (char) 252), IlIi0I0.I000II("ddot", "y", (char) 255), IlIi0I0.I000II("tilde", "a", (char) 227), IlIi0I0.I000II("tilde", "n", (char) 241), IlIi0I0.I000II("tilde", "o", (char) 245), IlIi0I0.I000II("cc", "", (char) 231), IlIi0I0.I000II("o", "", (char) 248), IlIi0I0.I000II("aa", "", (char) 229), IlIi0I0.I000II("ae", "", (char) 230), IlIi0I0.I000II("oe", "", (char) 339), IlIi0I0.I000II("ss", "", (char) 223), IlIi0I0.I000II("upquote", "", '\''), IlIi0I0.I000II(str24, "A", (char) 193), IlIi0I0.I000II(str24, "E", (char) 201), IlIi0I0.I000II(str24, "I", (char) 205), IlIi0I0.I000II(str24, "O", (char) 211), IlIi0I0.I000II(str24, "U", (char) 218), IlIi0I0.I000II(str24, "Y", (char) 221), IlIi0I0.I000II(str23, "A", (char) 192), IlIi0I0.I000II(str23, "E", (char) 200), IlIi0I0.I000II(str23, "I", (char) 204), IlIi0I0.I000II(str23, "O", (char) 210), IlIi0I0.I000II(str23, "U", (char) 217), IlIi0I0.I000II(str25, "A", (char) 194), IlIi0I0.I000II(str25, "E", (char) 202), IlIi0I0.I000II(str25, "I", (char) 206), IlIi0I0.I000II(str25, "O", (char) 212), IlIi0I0.I000II(str25, "U", (char) 219), IlIi0I0.I000II("ddot", "A", (char) 196), IlIi0I0.I000II("ddot", "E", (char) 203), IlIi0I0.I000II("ddot", "I", (char) 207), IlIi0I0.I000II("ddot", "O", (char) 214), IlIi0I0.I000II("ddot", "U", (char) 220), IlIi0I0.I000II("tilde", "A", (char) 195), IlIi0I0.I000II("tilde", "N", (char) 209), IlIi0I0.I000II("tilde", "O", (char) 213), IlIi0I0.I000II("CC", "", (char) 199), IlIi0I0.I000II("O", "", (char) 216), IlIi0I0.I000II("AA", "", (char) 197), IlIi0I0.I000II("AE", "", (char) 198), IlIi0I0.I000II("OE", "", (char) 338));
/* 5029 */          this.I00l0I0l0lO1 = new HashMap();
/* 5043 */          for (Map.Entry entry3 : mapI0000Il00O3.entrySet()) {
/* 5055 */              String str26 = (String) entry3.getKey();
/* 5061 */              O1IoOOii0Ioi o1IoOOii0Ioi = (O1IoOOii0Ioi) entry3.getValue();
/* 5069 */              if (o1IoOOii0Ioi.I00000oOI.length() != 0 && ((str = (String) ((HashMap) this.I00l0I0l0lO1).get(o1IoOOii0Ioi.I00000oOI)) == null || (str26.length() <= str.length() && (str26.length() != str.length() || str26.compareTo(str) <= 0)))) {
/* 5120 */                  ((HashMap) this.I00l0I0l0lO1).put(o1IoOOii0Ioi.I00000oOI, str26);
                        }
                    }
/* 5128 */          OIoi0IIoi oIoi0IIoiI00000oIO61 = lOoOiIo.I00000oIO("mathnormal", O1Ill10.I00iOIl);
/* 5132 */          O1Ill10 o1Ill10 = O1Ill10.I00iiI;
/* 5136 */          OIoi0IIoi oIoi0IIoiI00000oIO62 = lOoOiIo.I00000oIO("mathrm", o1Ill10);
/* 5142 */          OIoi0IIoi oIoi0IIoiI00000oIO63 = lOoOiIo.I00000oIO("textrm", o1Ill10);
/* 5148 */          OIoi0IIoi oIoi0IIoiI00000oIO64 = lOoOiIo.I00000oIO("rm", o1Ill10);
/* 5152 */          O1Ill10 o1Ill102 = O1Ill10.I00iiO;
/* 5156 */          OIoi0IIoi oIoi0IIoiI00000oIO65 = lOoOiIo.I00000oIO("mathbf", o1Ill102);
/* 5162 */          OIoi0IIoi oIoi0IIoiI00000oIO66 = lOoOiIo.I00000oIO("bf", o1Ill102);
/* 5168 */          OIoi0IIoi oIoi0IIoiI00000oIO67 = lOoOiIo.I00000oIO("textbf", o1Ill102);
/* 5172 */          O1Ill10 o1Ill103 = O1Ill10.I00iio;
/* 5176 */          OIoi0IIoi oIoi0IIoiI00000oIO68 = lOoOiIo.I00000oIO("mathcal", o1Ill103);
/* 5182 */          OIoi0IIoi oIoi0IIoiI00000oIO69 = lOoOiIo.I00000oIO("cal", o1Ill103);
/* 5186 */          O1Ill10 o1Ill104 = O1Ill10.I00ilI0I1;
/* 5190 */          OIoi0IIoi oIoi0IIoiI00000oIO70 = lOoOiIo.I00000oIO("mathtt", o1Ill104);
/* 5196 */          OIoi0IIoi oIoi0IIoiI00000oIO71 = lOoOiIo.I00000oIO("texttt", o1Ill104);
/* 5200 */          O1Ill10 o1Ill105 = O1Ill10.I00ilO0;
/* 5204 */          OIoi0IIoi oIoi0IIoiI00000oIO72 = lOoOiIo.I00000oIO("mathit", o1Ill105);
/* 5210 */          OIoi0IIoi oIoi0IIoiI00000oIO73 = lOoOiIo.I00000oIO("textit", o1Ill105);
/* 5216 */          OIoi0IIoi oIoi0IIoiI00000oIO74 = lOoOiIo.I00000oIO("mit", o1Ill105);
/* 5220 */          O1Ill10 o1Ill106 = O1Ill10.I00io1l;
/* 5224 */          OIoi0IIoi oIoi0IIoiI00000oIO75 = lOoOiIo.I00000oIO("mathsf", o1Ill106);
/* 5230 */          OIoi0IIoi oIoi0IIoiI00000oIO76 = lOoOiIo.I00000oIO("textsf", o1Ill106);
/* 5234 */          O1Ill10 o1Ill107 = O1Ill10.I00ioIO;
/* 5238 */          OIoi0IIoi oIoi0IIoiI00000oIO77 = lOoOiIo.I00000oIO("mathfrak", o1Ill107);
/* 5244 */          OIoi0IIoi oIoi0IIoiI00000oIO78 = lOoOiIo.I00000oIO("frak", o1Ill107);
/* 5252 */          OIoi0IIoi oIoi0IIoiI00000oIO79 = lOoOiIo.I00000oIO("mathbb", O1Ill10.I00l0I0l0lO1);
/* 5256 */          O1Ill10 o1Ill108 = O1Ill10.I00l0OO0IO;
/* 5284 */          this.I00l0OO0IO = O1Oii0O0loo.I0000Il00O(oIoi0IIoiI00000oIO61, oIoi0IIoiI00000oIO62, oIoi0IIoiI00000oIO63, oIoi0IIoiI00000oIO64, oIoi0IIoiI00000oIO65, oIoi0IIoiI00000oIO66, oIoi0IIoiI00000oIO67, oIoi0IIoiI00000oIO68, oIoi0IIoiI00000oIO69, oIoi0IIoiI00000oIO70, oIoi0IIoiI00000oIO71, oIoi0IIoiI00000oIO72, oIoi0IIoiI00000oIO73, oIoi0IIoiI00000oIO74, oIoi0IIoiI00000oIO75, oIoi0IIoiI00000oIO76, oIoi0IIoiI00000oIO77, oIoi0IIoiI00000oIO78, oIoi0IIoiI00000oIO79, lOoOiIo.I00000oIO("mathbfit", o1Ill108), lOoOiIo.I00000oIO("bm", o1Ill108), lOoOiIo.I00000oIO("text", o1Ill10));
/* 5366 */          this.I00li1OI = O1Oii0O0loo.I0000Il00O(lOoOiIo.I00000oIO("matrix", new String[]{""}), lOoOiIo.I00000oIO("pmatrix", new String[]{"(", ")"}), lOoOiIo.I00000oIO("bmatrix", new String[]{"[", "]"}), lOoOiIo.I00000oIO("Bmatrix", new String[]{"{", "}"}), lOoOiIo.I00000oIO("vmatrix", new String[]{"vert", "vert"}), lOoOiIo.I00000oIO("Vmatrix", new String[]{"Vert", "Vert"}));
                }

                public static O1IoOOii0Ioi I0000O(O1IoiiO0o1 o1IoiiO0o1, String str) {
/* 1 */             int iOrdinal = o1IoiiO0o1.ordinal();
/* 7 */             if (iOrdinal == 4) {
/* 95 */                return new O1Io1i0i(str, true);
                    }
/* 11 */            if (iOrdinal == 19) {
/* 89 */                return new O1O011o0(0.0f);
                    }
/* 15 */            if (iOrdinal == 21) {
/* 82 */                return new O1Ioll1o();
                    }
/* 19 */            if (iOrdinal == 10) {
/* 76 */                return new O1IllIIlII1(true);
                    }
/* 23 */            if (iOrdinal == 11) {
/* 70 */                return new O1O10o1l1();
                    }
                    switch (iOrdinal) {
                        case 13:
/* 64 */                    return new O1IoOOii0Ioi(O1IoiiO0o1.I00lll10, "□");
                        case 14:
/* 54 */                    return new O1Io0oIlI();
                        case 15:
/* 48 */                    return new O1O1I0Ilio0();
                        case 16:
/* 42 */                    return new O1O0l01o0();
                        case 17:
/* 36 */                    return new O1Il1I0OOii(str);
                        default:
/* 30 */                    return new O1IoOOii0Ioi(o1IoiiO0o1, str);
                    }
                }

                public static O1ooOo I000II(O1ooIoIolOli o1ooIoIolOli, O1ooOo o1ooOo) {
                    O1ooOo o1ooOoI000II;
/* 3 */             if (o1ooIoIolOli instanceof O1oooooIio) {
/* 7 */                 o1ooOoI000II = ((O1oooooIio) o1ooIoIolOli).I000II();
/* 15 */                o1ooOoI000II.I00iiO = OIIlOOiIlo.I0001Ioi1lo(o1ooOoI000II);
                    } else {
/* 20 */                I1o1il i1o1il = new I1o1il();
/* 27 */                i1o1il.I00iiO = OIIlOOiIlo.I0000O(o1ooIoIolOli);
/* 29 */                i1o1il.I00o0iI0io1 = o1ooIoIolOli;
/* 36 */                i1o1il.I00o101lO = new HashSet();
/* 38 */                o1ooOoI000II = i1o1il;
                    }
/* 41 */            if (o1ooOoI000II.I00lll10) {
/* 45 */                IolioOO1.I0000Il00O("A ModifierNodeElement cannot return an already attached node from create() ");
                    }
/* 49 */            o1ooOoI000II.I00l0I0l0lO1 = true;
/* 51 */            O1ooOo o1ooOo2 = o1ooOo.I00ilO0;
/* 53 */            if (o1ooOo2 != null) {
/* 55 */                o1ooOo2.I00ilI0I1 = o1ooOoI000II;
/* 57 */                o1ooOoI000II.I00ilO0 = o1ooOo2;
                    }
/* 59 */            o1ooOo.I00ilO0 = o1ooOoI000II;
/* 61 */            o1ooOoI000II.I00ilI0I1 = o1ooOo;
/* 106 */           return o1ooOoI000II;
                }

                public static O1ooOo I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             boolean z = o1ooOo.I00lll10;
/* 3 */             if (z) {
/* 5 */                 OI0o11I1 oI0o11I1 = OIIlOOiIlo.I00000oIO;
/* 7 */                 if (!z) {
/* 11 */                    IolioOO1.I0000Il00O("autoInvalidateRemovedNode called on unattached node");
                        }
/* 16 */                OIIlOOiIlo.I00000oIO(o1ooOo, -1, 2);
/* 19 */                o1ooOo.I010iIIOlo();
/* 22 */                o1ooOo.I0100o111I();
                    }
/* 25 */            O1ooOo o1ooOo2 = o1ooOo.I00ilO0;
/* 27 */            O1ooOo o1ooOo3 = o1ooOo.I00ilI0I1;
/* 30 */            if (o1ooOo2 != null) {
/* 32 */                o1ooOo2.I00ilI0I1 = o1ooOo3;
/* 34 */                o1ooOo.I00ilO0 = null;
                    }
/* 36 */            if (o1ooOo3 != null) {
/* 38 */                o1ooOo3.I00ilO0 = o1ooOo2;
/* 40 */                o1ooOo.I00ilI0I1 = null;
                    }
/* 77 */            return o1ooOo3;
                }

                public static O1Io1i0i I000lI(String str, boolean z) {
/* 3 */             return new O1Io1i0i(str, z);
                }

                public static String I0010I0i(O1IoiiO0o1 o1IoiiO0o1) {
                    switch (o1IoiiO0o1.ordinal()) {
                        case 0:
/* 82 */                    return "None";
                        case 1:
/* 79 */                    return "Ordinary";
                        case 2:
/* 76 */                    return "Number";
                        case 3:
/* 73 */                    return "Variable";
                        case 4:
/* 70 */                    return "Large Operator";
                        case 5:
/* 67 */                    return "Binary Operator";
                        case 6:
/* 64 */                    return "Unary Operator";
                        case 7:
/* 61 */                    return "Relation";
                        case 8:
/* 58 */                    return "Open";
                        case 9:
/* 55 */                    return "Close";
                        case 10:
/* 52 */                    return "Fraction";
                        case 11:
/* 49 */                    return "Radical";
                        case 12:
/* 46 */                    return "Punctuation";
                        case 13:
/* 43 */                    return "Placeholder";
                        case 14:
/* 40 */                    return "Inner";
                        case 15:
/* 37 */                    return OIllioIilO.I01Iio10lo;
                        case 16:
/* 34 */                    return OIllioIilO.I01IlIoOI;
                        case 17:
/* 31 */                    return "Accent";
                        case PoseLandmark.RIGHT_PINKY:
/* 28 */                    return "Boundary";
                        case PoseLandmark.LEFT_INDEX:
/* 25 */                    return "Space";
                        case PoseLandmark.RIGHT_INDEX:
/* 22 */                    return "Style";
                        case PoseLandmark.LEFT_THUMB:
/* 19 */                    return "Color";
                        case PoseLandmark.RIGHT_THUMB:
/* 16 */                    return "TextColor";
                        case PoseLandmark.LEFT_HIP:
/* 13 */                    return "Table";
                        default:
/* 8 */                     I000II.I00000oIO();
/* 11 */                    return null;
                    }
                }

                public static void I0010o(O1ooIoIolOli o1ooIoIolOli, O1ooIoIolOli o1ooIoIolOli2, O1ooOo o1ooOo) {
/* 4 */             if ((o1ooIoIolOli instanceof O1oooooIio) && (o1ooIoIolOli2 instanceof O1oooooIio)) {
/* 12 */                ((O1oooooIio) o1ooIoIolOli2).I000O01llI0(o1ooOo);
/* 17 */                if (o1ooOo.I00lll10) {
/* 19 */                    OIIlOOiIlo.I0000Il00O(o1ooOo);
/* 22 */                    return;
                        } else {
/* 23 */                    o1ooOo.I00l0OO0IO = true;
/* 25 */                    return;
                        }
                    }
/* 28 */            if (!(o1ooOo instanceof I1o1il)) {
/* 69 */                IolioOO1.I0000Il00O("Unknown Modifier.Node type");
/* 98 */                return;
                    }
/* 31 */            I1o1il i1o1il = (I1o1il) o1ooOo;
/* 35 */            if (i1o1il.I00lll10) {
/* 37 */                i1o1il.I010l1ol111();
                    }
/* 40 */            i1o1il.I00o0iI0io1 = o1ooIoIolOli2;
/* 46 */            i1o1il.I00iiO = OIIlOOiIlo.I0000O(o1ooIoIolOli2);
/* 50 */            if (i1o1il.I00lll10) {
/* 53 */                i1o1il.I010l1O(false);
                    }
/* 58 */            if (o1ooOo.I00lll10) {
/* 60 */                OIIlOOiIlo.I0000Il00O(o1ooOo);
                    } else {
/* 64 */                o1ooOo.I00l0OO0IO = true;
                    }
                }

                public O1IoOOii0Ioi I00000oIO(char c) {
/* 9 */             Map map = (Map) this.I00ioIO;
/* 11 */            String strValueOf = String.valueOf(c);
/* 17 */            if (1040 <= c && c < 1104) {
/* 25 */                return I0000O(O1IoiiO0o1.I00iiI, strValueOf);
                    }
/* 43 */            if (map.keySet().contains(Character.valueOf(c))) {
/* 53 */                OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) map.get(Character.valueOf(c));
/* 55 */                if (oIoi0IIoi != null) {
/* 59 */                    String str = (String) oIoi0IIoi.I00iOIl;
/* 61 */                    O1IoOOii0Ioi o1IoOOii0IoiI00000oOI = I00000oOI(str);
/* 65 */                    if (o1IoOOii0IoiI00000oOI != null) {
/* 67 */                        return o1IoOOii0IoiI00000oOI;
                            }
/* 76 */                    String str2 = (String) ((HashMap) this.I00ilI0I1).get(str);
/* 86 */                    O1Il1I0OOii o1Il1I0OOii = str2 != null ? new O1Il1I0OOii(str2) : null;
/* 87 */                    if (o1Il1I0OOii != null) {
/* 94 */                        O1IooO o1IooO = new O1IooO(new O1IoOOii0Ioi[0]);
/* 99 */                        CharSequence charSequence = (CharSequence) oIoi0IIoi.I00iiI;
/* 105 */                       if (charSequence.length() == 0) {
/* 123 */                           OIiilo1Ool0o.I000II("Char sequence is empty.");
/* 42 */                            return null;
                                }
/* 115 */                       o1IooO.I00000oIO(I00000oIO(charSequence.charAt(0)));
/* 118 */                       o1Il1I0OOii.I000OOo1O = o1IooO;
/* 120 */                       return o1Il1I0OOii;
                            }
                        }
                    } else if (c >= '!' && c <= '~' && !IOOi1I.I000O01llI0('$', '%', '#', '&', '~', '\'', '^', '_', '{', '}', '\\').contains(Character.valueOf(c))) {
/* 243 */               if (IOOi1I.I000O01llI0('(', '[').contains(Character.valueOf(c))) {
/* 247 */                   return I0000O(O1IoiiO0o1.I00l0I0l0lO1, strValueOf);
                        }
/* 290 */               if (IOOi1I.I000O01llI0(')', ']', '!', '?').contains(Character.valueOf(c))) {
/* 294 */                   return I0000O(O1IoiiO0o1.I00l0OO0IO, strValueOf);
                        }
/* 327 */               if (IOOi1I.I000O01llI0(',', ';').contains(Character.valueOf(c))) {
/* 331 */                   return I0000O(O1IoiiO0o1.I00lli11, strValueOf);
                        }
/* 370 */               if (IOOi1I.I000O01llI0('=', '>', '<').contains(Character.valueOf(c))) {
/* 374 */                   return I0000O(O1IoiiO0o1.I00ioIO, strValueOf);
                        }
/* 381 */               if (c == ':') {
/* 387 */                   return I0000O(O1IoiiO0o1.I00ioIO, "∶");
                        }
/* 394 */               if (c == '-') {
/* 400 */                   return I0000O(O1IoiiO0o1.I00ilO0, "−");
                        }
/* 433 */               if (IOOi1I.I000O01llI0('+', '*').contains(Character.valueOf(c))) {
/* 437 */                   return I0000O(O1IoiiO0o1.I00ilO0, strValueOf);
                        }
/* 444 */               if (c == '.' || ('0' <= c && c < ':')) {
/* 536 */                   return I0000O(O1IoiiO0o1.I00iiO, strValueOf);
                        }
/* 455 */               if (('a' <= c && c < '{') || ('A' <= c && c < '[')) {
/* 468 */                   return I0000O(O1IoiiO0o1.I00iio, strValueOf);
                        }
/* 513 */               if (IOOi1I.I000O01llI0('\'', '/', '@', '`', '|').contains(Character.valueOf(c))) {
/* 517 */                   return I0000O(O1IoiiO0o1.I00iiI, strValueOf);
                        }
/* 530 */               I000II.I0010I0i(IIlIOloOOO.I000oI1ioi(c, "Unknown ASCII character '", "'. Should have been handled earlier."));
/* 42 */                return null;
                    }
/* 42 */            return null;
                }

                public O1IoOOii0Ioi I00000oOI(String str) {
/* 9 */             String str2 = (String) ((HashMap) this.I00iiI).get(str);
/* 11 */            if (str2 != null) {
/* 13 */                str = str2;
                    }
/* 22 */            O1IoOOii0Ioi o1IoOOii0Ioi = (O1IoOOii0Ioi) ((HashMap) this.I00io1l).get(str);
/* 24 */            if (o1IoOOii0Ioi != null) {
/* 26 */                return o1IoOOii0Ioi.I00000oIO();
                    }
/* 31 */            return null;
                }

                @Override
                public Object I0000Il00O() {
/* 5 */             Object objI0000Il00O = ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 19 */            i0IOo0i0 i0ioo0i0 = new i0IOo0i0(liIllOil01.I00000oIO((Oi00IilOloo0) this.I00iiO));
/* 26 */            Object objI0000Il00O2 = ((i0IOo0i0) this.I00iio).I0000Il00O();
/* 34 */            Object objI0000Il00O3 = ((i0IOo0i0) this.I00ilI0I1).I0000Il00O();
/* 46 */            i0II0Oio01IO i0ii0oio01io = (i0II0Oio01IO) ((i0IOo0i0) this.I00ilO0).I0000Il00O();
/* 52 */            Object objI0000Il00O4 = ((i0IOo0i0) this.I00io1l).I0000Il00O();
/* 60 */            Object objI0000Il00O5 = ((i0IOo0i0) this.I00ioIO).I0000Il00O();
/* 68 */            Object objI0000Il00O6 = ((i0IOo0i0) this.I00l0I0l0lO1).I0000Il00O();
/* 82 */            i0IOo0i0 i0ioo0i02 = new i0IOo0i0(liIllOil01.I00000oIO((i0IOo0i0) this.I00l0OO0IO));
/* 107 */           i0OI1IOoili1 i0oi1iooili1 = (i0OI1IOoili1) ((i0IOo0i0) this.I00li1OI).I0000Il00O();
/* 109 */           i0OOOllloIII i0ooollloiii = new i0OOOllloIII();
/* 118 */           new Handler(Looper.getMainLooper());
/* 121 */           i0ooollloiii.I00000oIO = (i0Il00O1) objI0000Il00O;
/* 123 */           i0ooollloiii.I000O01llI0 = i0ioo0i0;
/* 125 */           i0ooollloiii.I00000oOI = (i0Iii1o10) objI0000Il00O2;
/* 127 */           i0ooollloiii.I0000Il00O = (i0Iio1OiI) objI0000Il00O3;
/* 129 */           i0ooollloiii.I0000O = i0ii0oio01io;
/* 131 */           i0ooollloiii.I0000oI00 = (i0O0oOiO11) objI0000Il00O5;
/* 133 */           i0ooollloiii.I000OOo1O = i0ioo0i02;
/* 135 */           i0ooollloiii.I0001Ioi1lo = i0oi1iooili1;
/* 137 */           VarHandle.storeStoreFence();
/* 245 */           return i0ooollloiii;
                }

                public O1IoOOii0Ioi I0000oI00(String str) {
/* 9 */             String str2 = (String) ((HashMap) this.I00iiO).get(str);
/* 11 */            if (str2 == null) {
/* 13 */                return null;
                    }
/* 19 */            return new O1IoOOii0Ioi(O1IoiiO0o1.I00oII, str2);
                }

                public LinkedHashSet I0001Ioi1lo(List list) throws IolIoOoi11 {
                    String strI00000oIO;
/* 3 */             OllO00oiil ollO00oiil = (OllO00oiil) this.I00iiO;
/* 9 */             Ii10Ioo00l ii10Ioo00l = (Ii10Ioo00l) ollO00oiil.getValue();
/* 13 */            IIo0l1 iIo0l1 = (IIo0l1) this.I00iio;
/* 17 */            List<String> listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(list);
/* 23 */            OlOO1i11110 olOO1i11110 = (OlOO1i11110) this.I00ilI0I1;
                    try {
/* 29 */                ArrayList arrayList = new ArrayList();
/* 32 */                IIlOlol0liO iIlOlol0liOI00000oIO = ii10Ioo00l.I00000oIO();
/* 37 */                if (iIo0l1 != null) {
                            try {
/* 45 */                        strI00000oIO = iOiolO.I00000oIO(iIlOlol0liOI00000oIO, iIo0l1.I00000oOI());
                            } catch (IllegalStateException unused) {
/* 50 */                        l11I11lO.I0000O(3, "CXCP");
/* 53 */                        strI00000oIO = null;
                            }
/* 56 */                    ArrayList arrayList2 = new ArrayList();
/* 67 */                    for (String str : listI00iIi0i1o) {
/* 79 */                        if (!O0000Ioio00.I0000O(str, strI00000oIO)) {
/* 84 */                            Ii10Ioo00l ii10Ioo00l2 = ii10Ioo00l.I00000oOI;
/* 88 */                            IOO000ilo iOO000ilo = new IOO000ilo(11);
/* 91 */                            iOO000ilo.I00iiI = ii10Ioo00l2;
/* 93 */                            VarHandle.storeStoreFence();
/* 98 */                            IIllI0o.I00000oOI(str);
/* 105 */                           iOO000ilo.I00iiO = new IIlIi0lIii(str, 0);
/* 107 */                           iOO000ilo.I00iio = olOO1i11110;
/* 125 */                           arrayList2.add(((IIllOo0) iOO000ilo.I000OiO().I001l0I00.get()).I0010o());
                                }
                            }
/* 135 */                   Iterator it = iIo0l1.I00000oIO(arrayList2).iterator();
/* 143 */                   while (it.hasNext()) {
/* 157 */                       arrayList.add(((IIllOioOlolI) it.next()).I0001Ioi1lo());
                            }
/* 161 */                   listI00iIi0i1o = arrayList;
                        }
/* 170 */               IIlOlol0liO iIlOlol0liOI00000oIO2 = ((Ii10Ioo00l) ollO00oiil.getValue()).I00000oIO();
/* 176 */               ArrayList arrayList3 = new ArrayList();
/* 187 */               for (String str2 : listI00iIi0i1o) {
/* 201 */                   if (O0000Ioio00.I0000O(str2, OIllioIilO.I01OO1I) || O0000Ioio00.I0000O(str2, "1")) {
/* 226 */                       arrayList3.add(str2);
                            } else if (iOilO1Ii.I00000oIO(str2, iIlOlol0liOI00000oIO2)) {
/* 218 */                       arrayList3.add(str2);
                            } else {
/* 222 */                       l11I11lO.I0000O(3, "CXCP");
                            }
                        }
/* 230 */               return new LinkedHashSet(arrayList3);
                    } catch (IllegalStateException e) {
/* 239 */               if (l11I11lO.I0000O(6, "CXCP")) {
/* 243 */                   Log.e("CXCP", "Error while accessing info about cameras.", e);
                        }
/* 437 */               throw new IolIoOoi11(e);
                    }
                }

                public Set I000OOo1O() {
                    synchronized (this.I00l0OO0IO) {
/* 12 */                if (((AtomicBoolean) this.I00li1OI).get()) {
/* 14 */                    return Il01llIol0.I00iOIl;
                        }
/* 28 */                return new LinkedHashSet((Set) this.I00l0I0l0lO1);
                    }
                }

                public IIllOo0 I000OiO(String str) throws IIoIIIiillO {
/* 9 */             if (((AtomicBoolean) this.I00li1OI).get()) {
/* 77 */                throw new IIoIIIiillO("CameraFactory has been shut down.");
                    }
/* 23 */            Ii10Ioo00l ii10Ioo00l = ((Ii10Ioo00l) ((OllO00oiil) this.I00iiO).getValue()).I00000oOI;
/* 27 */            IOO000ilo iOO000ilo = new IOO000ilo(11);
/* 30 */            iOO000ilo.I00iiI = ii10Ioo00l;
/* 32 */            VarHandle.storeStoreFence();
/* 37 */            IIllI0o.I00000oOI(str);
/* 44 */            iOO000ilo.I00iiO = new IIlIi0lIii(str, 0);
/* 50 */            iOO000ilo.I00iio = (OlOO1i11110) this.I00ilI0I1;
/* 62 */            return (IIllOo0) iOO000ilo.I000OiO().I001l0I00.get();
                }

                public boolean I000iOII(int i) {
                    return (((O1ooOo) this.I00io1l).I00iio & i) != 0;
                }

                public void I000l1(List list) throws IolIoOoi11 {
/* 9 */             if (((AtomicBoolean) this.I00li1OI).get()) {
/* 11 */                return;
                    }
/* 12 */            LinkedHashSet linkedHashSetI0001Ioi1lo = I0001Ioi1lo(list);
                    synchronized (this.I00l0OO0IO) {
                        try {
/* 27 */                    if (((AtomicBoolean) this.I00li1OI).get()) {
/* 30 */                        return;
                            }
/* 39 */                    if (O0000Ioio00.I0000O((Set) this.I00l0I0l0lO1, linkedHashSetI0001Ioi1lo)) {
/* 42 */                        return;
                            }
/* 50 */                    if (l11I11lO.I0000O(3, "CXCP")) {
/* 56 */                        Objects.toString((Set) this.I00l0I0l0lO1);
/* 59 */                        linkedHashSetI0001Ioi1lo.toString();
                            }
/* 65 */                    this.I00l0I0l0lO1 = linkedHashSetI0001Ioi1lo;
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public void I000o00OoI0I(O1ooOo o1ooOo, OIIlIII0Ili oIIlIII0Ili) {
/* 3 */             for (O1ooOo o1ooOo2 = o1ooOo.I00ilI0I1; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilI0I1) {
/* 9 */                 if (o1ooOo2 == ((OIIl1Oo11) this.I00iiO)) {
/* 15 */                    O0iiOioolIi o0iiOioolIiI001IO000 = ((O0iiOioolIi) this.I00iiI).I001IO000();
/* 29 */                    oIIlIII0Ili.I00oli = o0iiOioolIiI001IO000 != null ? (Iollol0oI) o0iiOioolIiI001IO000.I010101Oo1lO.I00iio : null;
/* 31 */                    this.I00ilI0I1 = oIIlIII0Ili;
/* 33 */                    return;
                        } else {
/* 38 */                    if ((o1ooOo2.I00iiO & 2) != 0) {
/* 106 */                       return;
                            }
/* 41 */                    o1ooOo2.I010l10O(oIIlIII0Ili);
                        }
                    }
                }

                public void I000oI1ioi() {
/* 5 */             for (O1ooOo o1ooOo = (O1ooOo) this.I00io1l; o1ooOo != null; o1ooOo = o1ooOo.I00ilO0) {
/* 7 */                 o1ooOo.I010i10l();
/* 12 */                if (o1ooOo.I00l0I0l0lO1) {
/* 14 */                    OI0o11I1 oI0o11I1 = OIIlOOiIlo.I00000oIO;
/* 18 */                    if (!o1ooOo.I00lll10) {
/* 22 */                        IolioOO1.I0000Il00O("autoInvalidateInsertedNode called on unattached node");
                            }
/* 27 */                    OIIlOOiIlo.I00000oIO(o1ooOo, -1, 1);
                        }
/* 32 */                if (o1ooOo.I00l0OO0IO) {
/* 34 */                    OIIlOOiIlo.I0000Il00O(o1ooOo);
                        }
/* 38 */                o1ooOo.I00l0I0l0lO1 = false;
/* 40 */                o1ooOo.I00l0OO0IO = false;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:118:0x026e, code lost:
                
                    r13 = r28 + 2;
                    r11 = r24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:119:0x0274, code lost:
                
                    r1 = r1 + 1;
                    r12 = r20;
                    r11 = r21;
                    r13 = r26;
                    r14 = r29;
                    r35 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x0154, code lost:
                
                    r26 = r13;
                    r29 = r14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x015a, code lost:
                
                    if ((r19 & 1) != 0) goto L58;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x015c, code lost:
                
                    r11 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x015e, code lost:
                
                    r11 = r33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x0160, code lost:
                
                    r13 = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x0161, code lost:
                
                    if (r13 > r1) goto L180;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x0163, code lost:
                
                    if (r13 == r12) goto L68;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x0165, code lost:
                
                    if (r13 == r1) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x0167, code lost:
                
                    r24 = r11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x0175, code lost:
                
                    if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x0178, code lost:
                
                    r24 = r11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x017a, code lost:
                
                    r11 = r20[(r13 - 1) + r17];
                    r14 = r11 - 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x0183, code lost:
                
                    r24 = r11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x0185, code lost:
                
                    r11 = r20[(r13 + 1) + r17];
                    r14 = r11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
                
                    r22 = r10 - ((r5 - r14) - r13);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
                
                    if (r1 == 0) goto L73;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
                
                    r25 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x0197, code lost:
                
                    r25 = r33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x0199, code lost:
                
                    if (r14 != r11) goto L76;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
                
                    r27 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:76:0x019e, code lost:
                
                    r27 = r33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:77:0x01a0, code lost:
                
                    r25 = r22 + (r25 & r27);
                    r22 = r11;
                    r11 = r22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:0x01aa, code lost:
                
                    if (r14 <= r7) goto L186;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:79:0x01ac, code lost:
                
                    if (r11 <= r15) goto L187;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:0x01ae, code lost:
                
                    r27 = r11;
                    r28 = r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x01ba, code lost:
                
                    if (r6.I00000oIO(r14 - 1, r27 - 1) == false) goto L185;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:82:0x01bc, code lost:
                
                    r14 = r14 - 1;
                    r11 = r27 - 1;
                    r13 = r28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x01c3, code lost:
                
                    r27 = r11;
                    r28 = r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:84:0x01c7, code lost:
                
                    r20[r17 + r28] = r14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:85:0x01cb, code lost:
                
                    if (r24 == 0) goto L181;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:86:0x01cd, code lost:
                
                    r11 = r19 - r28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:87:0x01cf, code lost:
                
                    if (r11 < r12) goto L182;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:88:0x01d1, code lost:
                
                    if (r11 > r1) goto L183;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
                
                    if (r16[r17 + r11] < r14) goto L184;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x01d9, code lost:
                
                    r26[r33] = r14;
                    r11 = 1;
                    r26[1] = r27;
                    r26[r32] = r22;
                    r26[3] = r25;
                    r26[4] = 1;
                 */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0115 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00100l0(int i, OI0oiiIO0 oI0oiiIO0, OI0oiiIO0 oI0oiiIO02, O1ooOo o1ooOo, boolean z) {
                    int i2;
                    int[] iArr;
                    int[] iArr2;
                    char c;
                    char c2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
/* 15 */            OI10llOi oI10llOi = (OI10llOi) this.I00li1OI;
/* 17 */            if (oI10llOi == null) {
/* 21 */                oI10llOi = new OI10llOi();
/* 24 */                oI10llOi.I00ilO0 = this;
/* 26 */                oI10llOi.I00iiO = o1ooOo;
/* 28 */                oI10llOi.I00iOIl = i;
/* 30 */                oI10llOi.I00iio = oI0oiiIO0;
/* 32 */                oI10llOi.I00ilI0I1 = oI0oiiIO02;
/* 34 */                oI10llOi.I00iiI = z;
/* 36 */                VarHandle.storeStoreFence();
/* 39 */                this.I00li1OI = oI10llOi;
                    } else {
/* 42 */                oI10llOi.I00iiO = o1ooOo;
/* 44 */                oI10llOi.I00iOIl = i;
/* 46 */                oI10llOi.I00iio = oI0oiiIO0;
/* 48 */                oI10llOi.I00ilI0I1 = oI0oiiIO02;
/* 50 */                oI10llOi.I00iiI = z;
                    }
/* 54 */            IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) oI10llOi.I00ilO0;
/* 57 */            this.I00li1OI = null;
/* 61 */            int i8 = oI0oiiIO0.I00000oOI - i;
/* 64 */            int i9 = oI0oiiIO02.I00000oOI - i;
/* 69 */            char c3 = 2;
/* 70 */            int i10 = ((i8 + i9) + 1) / 2;
/* 75 */            IooOlI11lli iooOlI11lli = new IooOlI11lli(i10 * 3);
/* 82 */            IooOlI11lli iooOlI11lli2 = new IooOlI11lli(i10 * 4);
/* 85 */            int i11 = 0;
/* 86 */            iooOlI11lli2.I0000oI00(0, i8, 0, i9);
/* 90 */            int i12 = (i10 * 2) + 1;
/* 91 */            int[] iArr3 = new int[i12];
/* 93 */            int[] iArr4 = new int[i12];
/* 96 */            int[] iArr5 = new int[5];
                    while (true) {
/* 98 */                int i13 = iooOlI11lli2.I00000oOI;
/* 100 */               if (i13 == 0) {
                            break;
                        }
/* 102 */               char c4 = c3;
/* 104 */               int[] iArr6 = iooOlI11lli2.I00000oIO;
/* 106 */               int i14 = i11;
                        int i15 = i13 - 1;
/* 110 */               iooOlI11lli2.I00000oOI = i15;
/* 112 */               int i16 = iArr6[i15];
                        int i17 = i13 - 2;
/* 118 */               iooOlI11lli2.I00000oOI = i17;
/* 120 */               int i18 = iArr6[i17];
                        int i19 = i13 - 3;
/* 124 */               iooOlI11lli2.I00000oOI = i19;
/* 126 */               int i20 = iArr6[i19];
                        int i21 = i13 - 4;
/* 130 */               iooOlI11lli2.I00000oOI = i21;
/* 132 */               int i22 = iArr6[i21];
/* 134 */               int i23 = i20 - i22;
/* 136 */               int i24 = i12;
/* 138 */               int i25 = i16 - i18;
/* 140 */               int[] iArr7 = iArr3;
/* 143 */               if (i23 < 1 || i25 < 1) {
/* 643 */                   iArr = iArr4;
/* 645 */                   iArr2 = iArr5;
                        } else {
/* 153 */                   int i26 = 1;
/* 155 */                   int i27 = ((i23 + i25) + 1) / 2;
/* 157 */                   int i28 = i24 / 2;
/* 159 */                   int i29 = i28 + 1;
/* 161 */                   iArr7[i29] = i22;
/* 163 */                   iArr4[i29] = i20;
/* 167 */                   int i30 = i14;
/* 169 */                   while (i30 < i27) {
/* 171 */                       int i31 = i23 - i25;
/* 177 */                       int i32 = i27;
/* 181 */                       iArr = iArr4;
/* 191 */                       int i33 = -i30;
/* 189 */                       int i34 = (Math.abs(i31) & 1) == i26 ? 1 : i14;
/* 194 */                       int i35 = i33;
                                while (true) {
/* 197 */                           if (i35 > i30) {
                                        break;
                                    }
/* 199 */                           if (i35 != i33) {
/* 201 */                               if (i35 != i30) {
/* 207 */                                   i3 = i35;
/* 215 */                                   iArr2 = iArr5;
/* 219 */                                   if (iArr7[i35 + 1 + i28] > iArr7[(i3 - 1) + i28]) {
                                            }
/* 250 */                                   int i36 = ((i5 - i22) + i18) - i3;
/* 268 */                                   int i37 = i36 - ((i30 != 0 ? 1 : i14) & (i5 == i4 ? 1 : i14));
/* 272 */                                   int i38 = i4;
/* 274 */                                   i6 = i36;
/* 276 */                                   while (i5 < i20 && i6 < i16 && oI10llOi.I00000oIO(i5, i6)) {
/* 286 */                                       i5++;
/* 288 */                                       i6++;
                                            }
/* 293 */                                   iArr7[i28 + i3] = i5;
/* 295 */                                   if (i34 != 0) {
/* 297 */                                       int i39 = i6;
/* 299 */                                       int i40 = i31 - i3;
/* 301 */                                       i7 = i23;
/* 305 */                                       if (i40 >= i33 + 1 && i40 <= i30 - 1 && iArr[i28 + i40] <= i5) {
/* 317 */                                           iArr2[i14] = i38;
/* 320 */                                           iArr2[1] = i37;
/* 322 */                                           iArr2[c4] = i5;
/* 324 */                                           iArr2[3] = i39;
/* 326 */                                           iArr2[4] = i14;
/* 328 */                                           c = 1;
                                                    break;
                                                }
                                            } else {
/* 331 */                                       i7 = i23;
                                            }
/* 333 */                                   i35 = i3 + 2;
/* 335 */                                   iArr5 = iArr2;
/* 337 */                                   i23 = i7;
                                        } else {
/* 222 */                                   i3 = i35;
/* 224 */                                   iArr2 = iArr5;
                                        }
/* 230 */                               i4 = iArr7[(i3 - 1) + i28];
/* 232 */                               i5 = i4 + 1;
/* 250 */                               int i362 = ((i5 - i22) + i18) - i3;
/* 268 */                               int i372 = i362 - ((i30 != 0 ? 1 : i14) & (i5 == i4 ? 1 : i14));
/* 272 */                               int i382 = i4;
/* 274 */                               i6 = i362;
/* 276 */                               while (i5 < i20) {
/* 286 */                                   i5++;
/* 288 */                                   i6++;
                                        }
/* 293 */                               iArr7[i28 + i3] = i5;
/* 295 */                               if (i34 != 0) {
                                        }
/* 333 */                               i35 = i3 + 2;
/* 335 */                               iArr5 = iArr2;
/* 337 */                               i23 = i7;
                                    } else {
/* 235 */                               i3 = i35;
/* 237 */                               iArr2 = iArr5;
                                    }
/* 243 */                           i4 = iArr7[i3 + 1 + i28];
/* 245 */                           i5 = i4;
/* 250 */                           int i3622 = ((i5 - i22) + i18) - i3;
/* 268 */                           int i3722 = i3622 - ((i30 != 0 ? 1 : i14) & (i5 == i4 ? 1 : i14));
/* 272 */                           int i3822 = i4;
/* 274 */                           i6 = i3622;
/* 276 */                           while (i5 < i20) {
                                    }
/* 293 */                           iArr7[i28 + i3] = i5;
/* 295 */                           if (i34 != 0) {
                                    }
/* 333 */                           i35 = i3 + 2;
/* 335 */                           iArr5 = iArr2;
/* 337 */                           i23 = i7;
                                }
/* 499 */                       if (Math.min(iArr2[c4] - iArr2[i14], iArr2[3] - iArr2[c]) > 0) {
/* 501 */                           int i41 = iArr2[i14];
/* 503 */                           int i42 = iArr2[c];
/* 507 */                           int i43 = iArr2[3] - i42;
/* 510 */                           int iMin = iArr2[c4] - i41;
/* 511 */                           if (i43 != iMin) {
/* 513 */                               iMin = Math.min(iMin, i43);
/* 517 */                               int i44 = iArr2[4];
/* 523 */                               int i45 = i44 != 0 ? 1 : i14;
/* 525 */                               int i46 = iArr2[3];
/* 527 */                               c2 = 1;
/* 529 */                               int i47 = iArr2[1];
/* 533 */                               int i48 = i46 - i47;
/* 535 */                               int i49 = iArr2[c4];
/* 537 */                               int i50 = iArr2[i14];
/* 553 */                               int i51 = i41 + (((i48 > i49 - i50 ? 1 : i14) | i45) ^ 1);
/* 580 */                               i42 += (((i46 - i47 > i49 - i50 ? 1 : i14) ^ 1) | (i44 != 0 ? 1 : i14)) ^ 1;
/* 581 */                               i41 = i51;
                                    } else {
/* 586 */                               c2 = 1;
                                    }
/* 588 */                           iooOlI11lli.I0000O(i41, i42, iMin);
                                } else {
/* 592 */                           c2 = c;
                                }
/* 598 */                       iooOlI11lli2.I0000oI00(i22, iArr2[i14], i18, iArr2[c2]);
/* 605 */                       iooOlI11lli2.I0000oI00(iArr2[c4], i20, iArr2[3], i16);
                            }
/* 643 */                   iArr = iArr4;
/* 645 */                   iArr2 = iArr5;
                        }
/* 608 */               c3 = c4;
/* 610 */               i11 = i14;
/* 612 */               i12 = i24;
/* 614 */               iArr3 = iArr7;
/* 616 */               iArr4 = iArr;
/* 618 */               iArr5 = iArr2;
                    }
/* 650 */           int i52 = i11;
/* 654 */           int i53 = iooOlI11lli.I00000oOI;
/* 658 */           if (i53 % 3 != 0) {
/* 665 */               IolioOO1.I0000Il00O("Array size not a multiple of 3");
                    }
/* 669 */           if (i53 > 3) {
/* 672 */               i2 = i52;
/* 674 */               iooOlI11lli.I0001Ioi1lo(i2, i53 - 3);
                    } else {
/* 678 */               i2 = i52;
                    }
/* 680 */           iooOlI11lli.I0000O(i8, i9, i2);
/* 683 */           int i54 = i2;
/* 684 */           int i55 = i54;
/* 685 */           int i56 = i55;
/* 688 */           while (i54 < iooOlI11lli.I00000oOI) {
/* 690 */               int[] iArr8 = iooOlI11lli.I00000oIO;
/* 692 */               int i57 = iArr8[i54];
/* 696 */               int i58 = iArr8[i54 + 2];
/* 698 */               int i59 = i57 - i58;
/* 703 */               int i60 = iArr8[i54 + 1] - i58;
/* 704 */               i54 += 3;
/* 706 */               while (i55 < i59) {
/* 710 */                   O1ooOo o1ooOo2 = (O1ooOo) oI10llOi.I00iiO;
/* 712 */                   O1ooOo o1ooOo3 = o1ooOo2.I00ilO0;
/* 718 */                   if ((o1ooOo3.I00iiO & 2) != 0) {
/* 720 */                       OIIlIII0Ili oIIlIII0Ili = o1ooOo3.I00ioIO;
/* 722 */                       OIIlIII0Ili oIIlIII0Ili2 = oIIlIII0Ili.I00oli;
/* 724 */                       OIIlIII0Ili oIIlIII0Ili3 = oIIlIII0Ili.I00olI;
/* 726 */                       if (oIIlIII0Ili2 != null) {
/* 728 */                           oIIlIII0Ili2.I00olI = oIIlIII0Ili3;
                                }
/* 730 */                       oIIlIII0Ili3.I00oli = oIIlIII0Ili2;
/* 732 */                       iIlOoolol0ll.I000o00OoI0I(o1ooOo2, oIIlIII0Ili3);
                            }
/* 739 */                   oI10llOi.I00iiO = I000O01llI0(o1ooOo3);
/* 741 */                   i55++;
                        }
/* 744 */               while (i56 < i60) {
/* 763 */                   O1ooOo o1ooOoI000II = I000II((O1ooIoIolOli) ((OI0oiiIO0) oI10llOi.I00ilI0I1).I000II(oI10llOi.I00iOIl + i56), (O1ooOo) oI10llOi.I00iiO);
/* 767 */                   oI10llOi.I00iiO = o1ooOoI000II;
/* 771 */                   if (oI10llOi.I00iiI) {
/* 775 */                       OIIlIII0Ili oIIlIII0Ili4 = o1ooOoI000II.I00ilO0.I00ioIO;
/* 777 */                       O0iOoioOoI o0iOoioOoII00000oOI = il0lI1i1olii.I00000oOI(o1ooOoI000II);
/* 781 */                       if (o0iOoioOoII00000oOI != null) {
/* 789 */                           O0iiIiio01I0 o0iiIiio01I0 = new O0iiIiio01I0((O0iiOioolIi) iIlOoolol0ll.I00iiI, o0iOoioOoII00000oOI);
/* 796 */                           ((O1ooOo) oI10llOi.I00iiO).I010l10O(o0iiIiio01I0);
/* 803 */                           iIlOoolol0ll.I000o00OoI0I((O1ooOo) oI10llOi.I00iiO, o0iiIiio01I0);
/* 808 */                           o0iiIiio01I0.I00oli = oIIlIII0Ili4.I00oli;
/* 810 */                           o0iiIiio01I0.I00olI = oIIlIII0Ili4;
/* 812 */                           oIIlIII0Ili4.I00oli = o0iiIiio01I0;
                                } else {
/* 819 */                           ((O1ooOo) oI10llOi.I00iiO).I010l10O(oIIlIII0Ili4);
                                }
/* 826 */                       ((O1ooOo) oI10llOi.I00iiO).I0100i();
/* 833 */                       ((O1ooOo) oI10llOi.I00iiO).I010i10l();
/* 838 */                       O1ooOo o1ooOo4 = (O1ooOo) oI10llOi.I00iiO;
/* 840 */                       OI0o11I1 oI0o11I1 = OIIlOOiIlo.I00000oIO;
/* 844 */                       if (!o1ooOo4.I00lll10) {
/* 848 */                           IolioOO1.I0000Il00O("autoInvalidateInsertedNode called on unattached node");
                                }
/* 853 */                       OIIlOOiIlo.I00000oIO(o1ooOo4, -1, 1);
                            } else {
/* 858 */                       o1ooOoI000II.I00l0I0l0lO1 = true;
                            }
/* 860 */                   i56++;
                        }
                        while (true) {
                            int i61 = i58 - 1;
/* 866 */                   if (i58 > 0) {
/* 874 */                       oI10llOi.I00iiO = ((O1ooOo) oI10llOi.I00iiO).I00ilO0;
/* 887 */                       O1ooIoIolOli o1ooIoIolOli = (O1ooIoIolOli) ((OI0oiiIO0) oI10llOi.I00iio).I000II(oI10llOi.I00iOIl + i55);
/* 900 */                       O1ooIoIolOli o1ooIoIolOli2 = (O1ooIoIolOli) ((OI0oiiIO0) oI10llOi.I00ilI0I1).I000II(oI10llOi.I00iOIl + i56);
/* 906 */                       if (!O0000Ioio00.I0000O(o1ooIoIolOli, o1ooIoIolOli2)) {
/* 912 */                           I0010o(o1ooIoIolOli, o1ooIoIolOli2, (O1ooOo) oI10llOi.I00iiO);
                                }
/* 915 */                       i55++;
/* 917 */                       i56++;
/* 919 */                       i58 = i61;
                            }
                        }
                    }
/* 921 */           this.I00li1OI = oI10llOi;
/* 929 */           int i62 = i2;
/* 930 */           for (O1ooOo o1ooOo5 = ((Olo11IOO) this.I00ilO0).I00ilI0I1; o1ooOo5 != null && o1ooOo5 != ((OIIl1Oo11) this.I00iiO); o1ooOo5 = o1ooOo5.I00ilI0I1) {
/* 940 */               i62 |= o1ooOo5.I00iiO;
/* 941 */               o1ooOo5.I00iio = i62;
                    }
                }

                public void I00100o1O0lo() {
                    O0iiIiio01I0 o0iiIiio01I0;
/* 3 */             O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) this.I00iiI;
/* 7 */             OIIlIII0Ili oIIlIII0Ili = (Iollol0oI) this.I00iio;
/* 15 */            for (O1ooOo o1ooOo = ((Olo11IOO) this.I00ilO0).I00ilI0I1; o1ooOo != null; o1ooOo = o1ooOo.I00ilI0I1) {
/* 17 */                O0iOoioOoI o0iOoioOoII00000oOI = il0lI1i1olii.I00000oOI(o1ooOo);
/* 21 */                if (o0iOoioOoII00000oOI != null) {
/* 23 */                    OIIlIII0Ili oIIlIII0Ili2 = o1ooOo.I00ioIO;
/* 25 */                    if (oIIlIII0Ili2 != null) {
/* 27 */                        O0iiIiio01I0 o0iiIiio01I02 = (O0iiIiio01I0) oIIlIII0Ili2;
/* 29 */                        O0iOoioOoI o0iOoioOoI = o0iiIiio01I02.I011iIOio;
/* 31 */                        o0iiIiio01I02.I01Io1(o0iOoioOoII00000oOI);
                                o0iiIiio01I0 = o0iiIiio01I02;
/* 34 */                        if (o0iOoioOoI != o1ooOo) {
/* 36 */                            OIlIooO oIlIooO = o0iiIiio01I02.I01101olii;
                                    o0iiIiio01I0 = o0iiIiio01I02;
/* 38 */                            if (oIlIooO != null) {
/* 42 */                                ((Io10OIiiOll) oIlIooO).I0000Il00O();
                                        o0iiIiio01I0 = o0iiIiio01I02;
                                    }
                                }
                            } else {
/* 48 */                        O0iiIiio01I0 o0iiIiio01I03 = new O0iiIiio01I0(o0iiOioolIi, o0iOoioOoII00000oOI);
/* 51 */                        o1ooOo.I010l10O(o0iiIiio01I03);
                                o0iiIiio01I0 = o0iiIiio01I03;
                            }
/* 54 */                    oIIlIII0Ili.I00oli = o0iiIiio01I0;
/* 56 */                    o0iiIiio01I0.I00olI = oIIlIII0Ili;
/* 58 */                    oIIlIII0Ili = o0iiIiio01I0;
                        } else {
/* 60 */                    o1ooOo.I010l10O(oIIlIII0Ili);
                        }
                    }
/* 66 */            O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
/* 80 */            oIIlIII0Ili.I00oli = o0iiOioolIiI001IO000 != null ? (Iollol0oI) o0iiOioolIiI001IO000.I010101Oo1lO.I00iio : null;
/* 82 */            this.I00ilI0I1 = oIIlIII0Ili;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0022 A[Catch: all -> 0x0017, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:13:0x001a, B:14:0x001c, B:16:0x0022, B:17:0x0044), top: B:24:0x0003, inners: #0 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public ListenableFuture I00111O(ll10Ii1io1I ll10ii1io1i, Executor executor) {
                    ListenableFuture listenableFutureI0000O;
                    synchronized (this.I00l0OO0IO) {
/* 6 */                 ListenableFuture listenableFuture = (ListenableFuture) this.I00li1OI;
/* 8 */                 if (listenableFuture == null || !listenableFuture.isDone()) {
/* 31 */                    listenableFutureI0000O = (ListenableFuture) this.I00li1OI;
/* 33 */                    if (listenableFutureI0000O == null) {
/* 37 */                        IoloOio0I ioloOio0I = (IoloOio0I) this.I00l0I0l0lO1;
/* 43 */                        i1Il01 i1il01 = new i1Il01(11);
/* 46 */                        i1il01.I00iiI = this;
/* 48 */                        VarHandle.storeStoreFence();
/* 63 */                        listenableFutureI0000O = IlloOoiiO.I0000O(ioloOio0I.I00OI1(o0iOII1liI.I00000oIO(i1il01), (OilOi0I1) this.I00ilI0I1));
/* 67 */                        this.I00li1OI = listenableFutureI0000O;
                            }
                        } else {
                            try {
/* 20 */                        IlloOoiiO.I00000oIO((ListenableFuture) this.I00li1OI);
                            } catch (ExecutionException unused) {
/* 27 */                        this.I00li1OI = null;
                            }
/* 31 */                    listenableFutureI0000O = (ListenableFuture) this.I00li1OI;
/* 33 */                    if (listenableFutureI0000O == null) {
                            }
                        }
                    }
/* 72 */            IoloOio0I ioloOio0I2 = (IoloOio0I) this.I00l0I0l0lO1;
/* 78 */            iOliil ioliil = new iOliil(19);
/* 81 */            ioliil.I00iiI = this;
/* 83 */            ioliil.I00iiO = listenableFutureI0000O;
/* 85 */            ioliil.I00iio = ll10ii1io1i;
/* 87 */            ioliil.I00ilI0I1 = executor;
/* 89 */            VarHandle.storeStoreFence();
/* 98 */            return ioloOio0I2.I00OI1(o0iOII1liI.I00000oIO(ioliil), Iii11Ooi.I00iOIl);
                }

                public i1ilO0II I001IIilI0O(Uri uri) throws IOException {
/* 3 */             o00ooO0IO0Oo o00ooo0io0oo = (o00ooO0IO0Oo) this.I00iio;
/* 7 */             String str = (String) this.I00iiI;
/* 11 */            lloOo1iol llooo1iol = (lloOo1iol) this.I00ilO0;
                    try {
                        try {
/* 17 */                    Io1Oioii1111 io1Oioii1111 = (Io1Oioii1111) this.I00ioIO;
/* 31 */                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
/* 34 */                    sb.append("Read ");
/* 37 */                    sb.append(str);
/* 40 */                    String string = sb.toString();
/* 44 */                    io1Oioii1111.getClass();
/* 47 */                    o0OI1ilol0l o0oi1ilol0lI00100l0 = Io1Oioii1111.I00100l0(string);
                            try {
/* 55 */                        InputStream inputStreamI00000oOI = ll1110lO.I00000oOI(llooo1iol.I00000oOI(uri));
                                try {
/* 72 */                            i1oi01OllI i1oi01olliI00000oIO = ((i1oO1llOO) ((iI0ooO1Oi000) o00ooo0io0oo.I00000oIO.I0010o(7))).I00000oIO(inputStreamI00000oOI, o00ooo0io0oo.I00000oOI);
/* 76 */                            if (inputStreamI00000oOI != null) {
/* 78 */                                inputStreamI00000oOI.close();
                                    }
/* 84 */                            o0oi1ilol0lI00100l0.close();
/* 87 */                            return i1oi01olliI00000oIO;
                                } finally {
                                }
                            } catch (Throwable th) {
                                try {
/* 104 */                           o0oi1ilol0lI00100l0.close();
                                } catch (Throwable th2) {
/* 109 */                           th.addSuppressed(th2);
                                }
/* 112 */                       throw th;
                            }
                        } catch (FileNotFoundException e) {
/* 113 */                   OillOo0 oillOo0I00000oOI = llooo1iol.I00000oOI(uri);
/* 129 */                   if (((loIo0iiOoi) oillOo0I00000oOI.I00iiI).I00000oOI((Uri) oillOo0I00000oOI.I00ilI0I1)) {
/* 134 */                       throw e;
                            }
/* 131 */                   return o00ooo0io0oo.I00000oIO;
                        }
                    } catch (IOException e2) {
/* 168 */               throw ll11oO0lo.I00000oIO(llooo1iol, uri, e2, str);
                    }
                }

                public void I001IO000(Uri uri, Object obj) throws IOException {
/* 3 */             String str = (String) this.I00iiI;
/* 7 */             lloOo1iol llooo1iol = (lloOo1iol) this.I00ilO0;
/* 31 */            Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
                    try {
/* 39 */                Io1Oioii1111 io1Oioii1111 = (Io1Oioii1111) this.I00ioIO;
/* 53 */                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
/* 56 */                sb.append("Write ");
/* 59 */                sb.append(str);
/* 62 */                String string = sb.toString();
/* 66 */                io1Oioii1111.getClass();
/* 69 */                o0OI1ilol0l o0oi1ilol0lI00100l0 = Io1Oioii1111.I00100l0(string);
                        try {
/* 77 */                    OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(13);
                            try {
/* 84 */                        OillOo0 oillOo0I00000oOI = llooo1iol.I00000oOI(uriBuild);
/* 100 */                       ArrayList arrayListI00II0Ol1O0l = oillOo0I00000oOI.I00II0Ol1O0l(((loIo0iiOoi) oillOo0I00000oOI.I00iiI).I0000O((Uri) oillOo0I00000oOI.I00ilI0I1));
/* 107 */                       new OoOlO1O0o[]{ooOlO1O0o}[0].I000O01llI0(arrayListI00II0Ol1O0l);
/* 114 */                       OutputStream outputStream = (OutputStream) arrayListI00II0Ol1O0l.get(0);
                                try {
/* 118 */                           ((i1ilO0II) obj).I00000oOI(outputStream);
/* 125 */                           if (((lo1OoIIlll) ooOlO1O0o.I00iiO) == null) {
/* 204 */                               throw new IOO1IOl1O10("Cannot sync underlying stream");
                                    }
/* 131 */                           ((OutputStream) ooOlO1O0o.I00iiI).flush();
/* 144 */                           ((lo1OoIIlll) ooOlO1O0o.I00iiO).I00iOIl.getFD().sync();
/* 147 */                           outputStream.close();
/* 150 */                           o0oi1ilol0lI00100l0.close();
/* 153 */                           OillOo0 oillOo0I00000oOI2 = llooo1iol.I00000oOI(uriBuild);
/* 157 */                           OillOo0 oillOo0I00000oOI3 = llooo1iol.I00000oOI(uri);
/* 163 */                           loIo0iiOoi loio0iiooi = (loIo0iiOoi) oillOo0I00000oOI2.I00iiI;
/* 169 */                           if (loio0iiooi != ((loIo0iiOoi) oillOo0I00000oOI3.I00iiI)) {
/* 190 */                               throw new IOO1IOl1O10("Cannot rename file across backends");
                                    }
/* 179 */                           loio0iiooi.I0001Ioi1lo((Uri) oillOo0I00000oOI2.I00ilI0I1, (Uri) oillOo0I00000oOI3.I00ilI0I1);
                                } catch (Throwable th) {
/* 206 */                           if (outputStream != null) {
                                        try {
/* 208 */                                   outputStream.close();
                                        } catch (Throwable th2) {
/* 213 */                                   th.addSuppressed(th2);
                                        }
                                    }
/* 216 */                           throw th;
                                }
                            } catch (IOException e) {
/* 221 */                       throw ll11oO0lo.I00000oIO(llooo1iol, uri, e, str);
                            }
                        } finally {
                        }
                    } catch (IOException e2) {
/* 231 */               OillOo0 oillOo0I00000oOI4 = llooo1iol.I00000oOI(uriBuild);
/* 247 */               if (((loIo0iiOoi) oillOo0I00000oOI4.I00iiI).I00000oOI((Uri) oillOo0I00000oOI4.I00ilI0I1)) {
                            try {
/* 249 */                       OillOo0 oillOo0I00000oOI5 = llooo1iol.I00000oOI(uriBuild);
/* 261 */                       ((loIo0iiOoi) oillOo0I00000oOI5.I00iiI).I0000oI00((Uri) oillOo0I00000oOI5.I00ilI0I1);
                            } catch (IOException e3) {
/* 266 */                       e2.addSuppressed(e3);
                            }
                        }
/* 332 */               throw e2;
                    }
                }

                public o000O0OO I001i1O0Ol() {
/* 3 */             o000O0OO o000o0oo = new o000O0OO();
/* 10 */            o000o0oo.I00000oIO = (lollOoOoo) this.I00iiI;
/* 16 */            o000o0oo.I00000oOI = (loo00iO11) this.I00iiO;
/* 22 */            o000o0oo.I0000Il00O = (lool1O1l11io) this.I00iio;
/* 28 */            o000o0oo.I0000O = (looOio1l) this.I00ilI0I1;
/* 34 */            o000o0oo.I0000oI00 = (loooI0l1III1) this.I00ilO0;
/* 40 */            o000o0oo.I0001Ioi1lo = (iiOOi1OolOlO) this.I00io1l;
/* 46 */            o000o0oo.I000II = (loolO1Oi1) this.I00ioIO;
/* 52 */            o000o0oo.I000O01llI0 = (o010o1iIl) this.I00l0I0l0lO1;
/* 58 */            o000o0oo.I000OOo1O = (Long) this.I00l0OO0IO;
/* 64 */            o000o0oo.I000OiO = (Integer) this.I00li1OI;
/* 66 */            VarHandle.storeStoreFence();
/* 110 */           return o000o0oo;
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 2:
/* 15 */                    StringBuilder sb = new StringBuilder("[");
/* 20 */                    O1ooOo o1ooOo = (O1ooOo) this.I00io1l;
/* 24 */                    Olo11IOO olo11IOO = (Olo11IOO) this.I00ilO0;
/* 28 */                    if (o1ooOo == olo11IOO) {
/* 30 */                        sb.append("]");
                            } else {
                                while (true) {
/* 34 */                            if (o1ooOo != null && o1ooOo != olo11IOO) {
/* 42 */                                sb.append(String.valueOf(o1ooOo));
/* 47 */                                if (o1ooOo.I00ilO0 == olo11IOO) {
/* 49 */                                    sb.append("]");
                                        } else {
/* 55 */                                    sb.append(",");
/* 58 */                                    o1ooOo = o1ooOo.I00ilO0;
                                        }
                                    }
                                }
                            }
/* 61 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 5368 */      public IIlOoolol0ll(int i) {
/* 5369 */          this.I00iOIl = i;
                }
            }
