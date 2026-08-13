            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.PrintWriter;
            import java.lang.reflect.Modifier;
            import java.util.ArrayList;
            import java.util.Objects;
            
            public final class I1loiIo implements Ill1Ioil00 {
                public final ArrayList I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public boolean I000II;
                public String I000O01llI0;
                public int I000OOo1O;
                public CharSequence I000OiO;
                public int I000iOII;
                public CharSequence I000l1;
                public ArrayList I000lI;
                public ArrayList I000o00OoI0I;
                public boolean I000oI1ioi;
                public final Ill1OlOOl I00100l0;
                public boolean I00100o1O0lo;
                public int I0010I0i;

                public I1loiIo(Ill1OlOOl ill1OlOOl) {
/* 1 */             ill1OlOOl.I00IO1();
/* 4 */             Ill0lo1oI0I ill0lo1oI0I = ill1OlOOl.I00111O;
/* 6 */             if (ill0lo1oI0I != null) {
/* 10 */                ill0lo1oI0I.I00iiI.getClassLoader();
                    }
/* 21 */            this.I00000oIO = new ArrayList();
/* 24 */            this.I000oI1ioi = false;
/* 27 */            this.I0010I0i = -1;
/* 29 */            this.I00100l0 = ill1OlOOl;
                }

                @Override
                public final boolean I00000oIO(ArrayList arrayList, ArrayList arrayList2) {
/* 6 */             if (Ill1OlOOl.I00IOO(2)) {
/* 8 */                 toString();
                    }
/* 11 */            arrayList.add(this);
/* 16 */            arrayList2.add(Boolean.FALSE);
/* 21 */            if (!this.I000II) {
/* 39 */                return true;
                    }
/* 23 */            Ill1OlOOl ill1OlOOl = this.I00100l0;
/* 25 */            ArrayList arrayList3 = ill1OlOOl.I0000O;
/* 27 */            if (arrayList3 == null) {
/* 31 */                arrayList3 = new ArrayList();
/* 34 */                ill1OlOOl.I0000O = arrayList3;
                    }
/* 36 */            arrayList3.add(this);
/* 39 */            return true;
                }

                public final void I00000oOI(IllI1011IlO illI1011IlO) {
/* 3 */             this.I00000oIO.add(illI1011IlO);
/* 8 */             illI1011IlO.I0000O = this.I00000oOI;
/* 12 */            illI1011IlO.I0000oI00 = this.I0000Il00O;
/* 16 */            illI1011IlO.I0001Ioi1lo = this.I0000O;
/* 20 */            illI1011IlO.I000II = this.I0000oI00;
                }

                public final void I0000Il00O(int i) {
/* 3 */             if (this.I000II) {
/* 11 */                if (Ill1OlOOl.I00IOO(2)) {
/* 13 */                    toString();
                        }
/* 16 */                ArrayList arrayList = this.I00000oIO;
/* 18 */                int size = arrayList.size();
/* 23 */                for (int i2 = 0; i2 < size; i2++) {
/* 29 */                    IllI1011IlO illI1011IlO = (IllI1011IlO) arrayList.get(i2);
/* 31 */                    Ill0l1 ill0l1 = illI1011IlO.I00000oOI;
/* 33 */                    if (ill0l1 != null) {
                                ill0l1.I00o101lO += i;
/* 44 */                        if (Ill1OlOOl.I00IOO(2)) {
/* 48 */                            Objects.toString(illI1011IlO.I00000oOI);
/* 53 */                            int i3 = illI1011IlO.I00000oOI.I00o101lO;
                                }
                            }
                        }
                    }
                }

                public final int I0000O(boolean z) {
/* 3 */             if (this.I00100o1O0lo) {
/* 62 */                I000II.I001IO000("commit already called");
/* 65 */                return 0;
                    }
/* 11 */            if (Ill1OlOOl.I00IOO(2)) {
/* 13 */                toString();
/* 23 */                PrintWriter printWriter = new PrintWriter(new O1I1Iilll00o());
/* 28 */                I0001Ioi1lo("  ", printWriter, true);
/* 31 */                printWriter.close();
                    }
/* 34 */            this.I00100o1O0lo = true;
/* 36 */            boolean z2 = this.I000II;
/* 38 */            Ill1OlOOl ill1OlOOl = this.I00100l0;
/* 40 */            if (z2) {
/* 48 */                this.I0010I0i = ill1OlOOl.I000OOo1O.getAndIncrement();
                    } else {
/* 52 */                this.I0010I0i = -1;
                    }
/* 54 */            ill1OlOOl.I001i1O0Ol(this, z);
/* 57 */            return this.I0010I0i;
                }

                public final void I0000oI00(int i, Ill0l1 ill0l1, String str) {
/* 1 */             String str2 = ill0l1.I010iIIOlo;
/* 3 */             if (str2 != null) {
/* 5 */                 IllI0oOli.I00000oOI(ill0l1, str2);
                    }
/* 8 */             Class<?> cls = ill0l1.getClass();
/* 12 */            int modifiers = cls.getModifiers();
/* 20 */            if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
/* 188 */               I000II.I000OiO(cls.getCanonicalName(), "Fragment ", " must be a public static class to be  properly recreated from instance state.");
/* 408 */               return;
                    }
/* 44 */            if (str != null) {
/* 46 */                String str3 = ill0l1.I00olI;
/* 48 */                if (str3 != null && !str.equals(str3)) {
/* 61 */                    StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
/* 64 */                    sb.append(ill0l1);
/* 67 */                    sb.append(": was ");
/* 76 */                    I000II.I001IO000(IIlIOloOOO.I0010I0i(sb, ill0l1.I00olI, " now ", str));
/* 79 */                    return;
                        }
/* 80 */                ill0l1.I00olI = str;
                    }
/* 82 */            if (i != 0) {
/* 85 */                if (i == -1) {
/* 165 */                   throw new IllegalArgumentException("Can't add fragment " + ill0l1 + " with tag " + str + " to container view with no id");
                        }
/* 87 */                int i2 = ill0l1.I00oOio10iI1;
/* 89 */                if (i2 != 0 && i2 != i) {
/* 100 */                   StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
/* 103 */                   sb2.append(ill0l1);
/* 106 */                   int i3 = ill0l1.I00oOio10iI1;
/* 108 */                   sb2.append(": was ");
/* 111 */                   sb2.append(i3);
/* 114 */                   sb2.append(" now ");
/* 117 */                   sb2.append(i);
/* 127 */                   throw new IllegalStateException(sb2.toString());
                        }
/* 128 */               ill0l1.I00oOio10iI1 = i;
/* 130 */               ill0l1.I00ol1 = i;
                    }
/* 172 */           I00000oOI(new IllI1011IlO(1, ill0l1));
/* 177 */           ill0l1.I00oI0i = this.I00100l0;
                }

                public final void I0001Ioi1lo(String str, PrintWriter printWriter, boolean z) {
                    String str2;
/* 1 */             if (z) {
/* 3 */                 printWriter.print(str);
/* 8 */                 printWriter.print("mName=");
/* 13 */                printWriter.print(this.I000O01llI0);
/* 18 */                printWriter.print(" mIndex=");
/* 23 */                printWriter.print(this.I0010I0i);
/* 28 */                printWriter.print(" mCommitted=");
/* 33 */                printWriter.println(this.I00100o1O0lo);
/* 38 */                if (this.I0001Ioi1lo != 0) {
/* 40 */                    printWriter.print(str);
/* 45 */                    printWriter.print("mTransition=#");
/* 54 */                    printWriter.print(Integer.toHexString(this.I0001Ioi1lo));
                        }
/* 59 */                if (this.I00000oOI != 0 || this.I0000Il00O != 0) {
/* 65 */                    printWriter.print(str);
/* 70 */                    printWriter.print("mEnterAnim=#");
/* 79 */                    printWriter.print(Integer.toHexString(this.I00000oOI));
/* 84 */                    printWriter.print(" mExitAnim=#");
/* 93 */                    printWriter.println(Integer.toHexString(this.I0000Il00O));
                        }
/* 98 */                if (this.I0000O != 0 || this.I0000oI00 != 0) {
/* 104 */                   printWriter.print(str);
/* 109 */                   printWriter.print("mPopEnterAnim=#");
/* 118 */                   printWriter.print(Integer.toHexString(this.I0000O));
/* 123 */                   printWriter.print(" mPopExitAnim=#");
/* 132 */                   printWriter.println(Integer.toHexString(this.I0000oI00));
                        }
/* 137 */               if (this.I000OOo1O != 0 || this.I000OiO != null) {
/* 143 */                   printWriter.print(str);
/* 148 */                   printWriter.print("mBreadCrumbTitleRes=#");
/* 157 */                   printWriter.print(Integer.toHexString(this.I000OOo1O));
/* 162 */                   printWriter.print(" mBreadCrumbTitleText=");
/* 167 */                   printWriter.println(this.I000OiO);
                        }
/* 172 */               if (this.I000iOII != 0 || this.I000l1 != null) {
/* 178 */                   printWriter.print(str);
/* 183 */                   printWriter.print("mBreadCrumbShortTitleRes=#");
/* 192 */                   printWriter.print(Integer.toHexString(this.I000iOII));
/* 197 */                   printWriter.print(" mBreadCrumbShortTitleText=");
/* 202 */                   printWriter.println(this.I000l1);
                        }
                    }
/* 205 */           ArrayList arrayList = this.I00000oIO;
/* 211 */           if (arrayList.isEmpty()) {
/* 401 */               return;
                    }
/* 213 */           printWriter.print(str);
/* 218 */           printWriter.println("Operations:");
/* 221 */           int size = arrayList.size();
/* 226 */           for (int i = 0; i < size; i++) {
/* 232 */               IllI1011IlO illI1011IlO = (IllI1011IlO) arrayList.get(i);
                        switch (illI1011IlO.I00000oIO) {
                            case 0:
/* 286 */                       str2 = "NULL";
                                break;
                            case 1:
/* 283 */                       str2 = "ADD";
                                break;
                            case 2:
/* 280 */                       str2 = "REPLACE";
                                break;
                            case 3:
/* 277 */                       str2 = "REMOVE";
                                break;
                            case 4:
/* 274 */                       str2 = "HIDE";
                                break;
                            case 5:
/* 271 */                       str2 = "SHOW";
                                break;
                            case 6:
/* 268 */                       str2 = "DETACH";
                                break;
                            case 7:
/* 265 */                       str2 = "ATTACH";
                                break;
                            case 8:
/* 262 */                       str2 = "SET_PRIMARY_NAV";
                                break;
                            case 9:
/* 259 */                       str2 = "UNSET_PRIMARY_NAV";
                                break;
                            case 10:
/* 256 */                       str2 = "OP_SET_MAX_LIFECYCLE";
                                break;
                            default:
/* 251 */                       str2 = "cmd=" + illI1011IlO.I00000oIO;
                                break;
                        }
/* 288 */               printWriter.print(str);
/* 293 */               printWriter.print("  Op #");
/* 296 */               printWriter.print(i);
/* 301 */               printWriter.print(": ");
/* 304 */               printWriter.print(str2);
/* 309 */               printWriter.print(" ");
/* 314 */               printWriter.println(illI1011IlO.I00000oOI);
/* 317 */               if (z) {
/* 321 */                   if (illI1011IlO.I0000O != 0 || illI1011IlO.I0000oI00 != 0) {
/* 327 */                       printWriter.print(str);
/* 332 */                       printWriter.print("enterAnim=#");
/* 341 */                       printWriter.print(Integer.toHexString(illI1011IlO.I0000O));
/* 346 */                       printWriter.print(" exitAnim=#");
/* 355 */                       printWriter.println(Integer.toHexString(illI1011IlO.I0000oI00));
                            }
/* 360 */                   if (illI1011IlO.I0001Ioi1lo != 0 || illI1011IlO.I000II != 0) {
/* 366 */                       printWriter.print(str);
/* 371 */                       printWriter.print("popEnterAnim=#");
/* 380 */                       printWriter.print(Integer.toHexString(illI1011IlO.I0001Ioi1lo));
/* 385 */                       printWriter.print(" popExitAnim=#");
/* 394 */                       printWriter.println(Integer.toHexString(illI1011IlO.I000II));
                            }
                        }
                    }
                }

                public final void I000II(Ill0l1 ill0l1) {
/* 1 */             Ill1OlOOl ill1OlOOl = ill0l1.I00oI0i;
/* 3 */             if (ill1OlOOl == null || ill1OlOOl == this.I00100l0) {
/* 45 */                I00000oOI(new IllI1011IlO(3, ill0l1));
/* 77 */                return;
                    }
/* 38 */            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + ill0l1.toString() + " is already attached to a FragmentManager.");
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(Barcode.FORMAT_ITF);
/* 10 */            sb.append("BackStackEntry{");
/* 21 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 26 */            if (this.I0010I0i >= 0) {
/* 30 */                sb.append(" #");
/* 35 */                sb.append(this.I0010I0i);
                    }
/* 40 */            if (this.I000O01llI0 != null) {
/* 44 */                sb.append(" ");
/* 49 */                sb.append(this.I000O01llI0);
                    }
/* 54 */            sb.append("}");
/* 57 */            return sb.toString();
                }
            }
