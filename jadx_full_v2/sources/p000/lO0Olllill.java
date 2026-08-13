            package p000;

            import android.content.Context;
            import android.os.Build;
            import android.util.Log;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            public final class lO0Olllill {
                public static final Object I0000O = new Object();
                public static String I0000oI00;
                public final OO11il0 I00000oIO;
                public final I01l1o I00000oOI;
                public final io0oo1l1 I0000Il00O;

                public lO0Olllill(Context context, OO11il0 oO11il0, I01l1o i01l1o) {
/* 4 */             this.I00000oIO = oO11il0;
/* 6 */             this.I00000oOI = i01l1o;
/* 23 */            String strI000oI1ioi = IIl001iO0Io.I000oI1ioi("com.google.mlkit.MiniBenchmarkPersistence.", ((I1lI11l11OIo) oO11il0).I00000oIO, ".", ((I1lI11l11OIo) oO11il0).I00000oOI);
/* 27 */            io0oo1l1 io0oo1l1Var = new io0oo1l1();
/* 30 */            io0oo1l1Var.I00000oIO = context;
/* 32 */            io0oo1l1Var.I00000oOI = strI000oI1ioi;
/* 34 */            VarHandle.storeStoreFence();
/* 37 */            this.I0000Il00O = io0oo1l1Var;
                }

                public static final String I0000O() {
                    String str;
                    synchronized (I0000O) {
/* 4 */                 str = I0000oI00;
/* 6 */                 if (str == null) {
                            try {
/* 8 */                         il1I111 il1i111I00000oIO = l0IIloIo1i0i.I00000oIO();
/* 42 */                        str = il1i111I00000oIO.I0000oI00 + ";" + il1i111I00000oIO.I00000oIO + ";" + il1i111I00000oIO.I00000oOI;
/* 46 */                        I0000oI00 = str;
                            } catch (iliiIi1i | RuntimeException e) {
/* 54 */                        I0000oI00 = "";
/* 62 */                        throw new I01l1111(2, e);
                            }
                        }
                    }
/* 64 */            return str;
                }

                public static String I000II(String str, String str2) {
/* 17 */            return str + "_" + str2;
                }

                public static void I000O01llI0() {
/* 4 */             Log.isLoggable("MiniBenchPersistence", 3);
                }

                public static final HashMap I000OOo1O(loO1IolO loo1iolo) {
/* 3 */             HashMap map = new HashMap();
/* 18 */            for (ll0oOiiIi ll0ooiiii : loo1iolo.I001i1lo1io()) {
/* 30 */                if (ll0ooiiii.I00100o1O0lo() != 0) {
/* 34 */                    iOoIoO1I iooioo1i = new iOoIoO1I();
/* 41 */                    iooioo1i.I00000oIO = ll0ooiiii.I001lIiIIo1O();
/* 48 */                    iooioo1i.I0000oI00 = (byte) (iooioo1i.I0000oI00 | 1);
/* 54 */                    iooioo1i.I00000oOI = ll0ooiiii.I00100o1O0lo();
/* 61 */                    iooioo1i.I0000oI00 = (byte) (iooioo1i.I0000oI00 | 2);
/* 67 */                    iooioo1i.I0000Il00O = ll0ooiiii.I000oI1ioi();
/* 74 */                    iooioo1i.I0000oI00 = (byte) (iooioo1i.I0000oI00 | 4);
/* 80 */                    iooioo1i.I0000O = ll0ooiiii.I00100l0();
/* 87 */                    iooioo1i.I0000oI00 = (byte) (iooioo1i.I0000oI00 | 8);
/* 105 */                   map.put(I000II(ll0ooiiii.I00111O(), ll0ooiiii.I0010o()), iooioo1i.I00000oIO());
                        }
                    }
/* 115 */           "getResultIdToCompletedResultMap: ".concat(map.toString());
/* 118 */           I000O01llI0();
/* 186 */           return map;
                }

                public final ArrayList I00000oIO(I01l10Oi i01l10Oi, List list) throws IOException {
/* 1 */             I000O01llI0();
/* 4 */             loO1IolO loo1ioloI0001Ioi1lo = I0001Ioi1lo();
/* 8 */             if (loo1ioloI0001Ioi1lo == null) {
/* 12 */                return new ArrayList();
                    }
/* 18 */            ArrayList arrayList = new ArrayList();
/* 21 */            HashMap mapI000OOo1O = I000OOo1O(loo1ioloI0001Ioi1lo);
/* 25 */            Iterator it = list.iterator();
/* 33 */            while (it.hasNext()) {
/* 39 */                String str = (String) it.next();
/* 60 */                if (!mapI000OOo1O.containsKey(I000II(str, ((I01l10Oi) i01l10Oi.cloneWithRunConfigAssigned(str, true)).encode()))) {
/* 62 */                    arrayList.add(str);
                        }
                    }
/* 89 */            return arrayList;
                }

                public final void I00000oOI() {
                    lo00l1i1O1O lo00l1i1o1oI0000oI00;
/* 1 */             io0oo1l1 io0oo1l1Var = this.I0000Il00O;
/* 3 */             io0oo1l1Var.I00000oOI();
                    try {
/* 6 */                 I000O01llI0();
/* 9 */                 loO1IolO loo1ioloI0001Ioi1lo = I0001Ioi1lo();
/* 13 */                if (loo1ioloI0001Ioi1lo != null && (lo00l1i1o1oI0000oI00 = I0000oI00()) != null) {
/* 34 */                    for (ll0oOiiIi ll0ooiiii : loo1ioloI0001Ioi1lo.I001i1lo1io()) {
/* 46 */                        if (ll0ooiiii.I00100o1O0lo() == 0) {
/* 58 */                            "Benchmark result cleared for ".concat(String.valueOf(ll0ooiiii.I00111O()));
/* 61 */                            I000O01llI0();
                                } else {
/* 67 */                            lo00l1i1o1oI0000oI00.I0000O(ll0ooiiii);
                                }
                            }
/* 81 */                    io0oo1l1Var.I0000Il00O(((loO1IolO) lo00l1i1o1oI0000oI00.I00000oIO()).I00000oOI());
                        }
                    } finally {
/* 88 */                io0oo1l1Var.I0000O();
                    }
                }

                public final void I0000Il00O(String str, I01l10Oi i01l10Oi, I1l1iI1Io i1l1iI1Io) {
/* 1 */             io0oo1l1 io0oo1l1Var = this.I0000Il00O;
/* 3 */             io0oo1l1Var.I00000oOI();
                    try {
/* 6 */                 I000O01llI0();
/* 9 */                 loO1IolO loo1ioloI0001Ioi1lo = I0001Ioi1lo();
/* 13 */                if (loo1ioloI0001Ioi1lo != null) {
/* 17 */                    liii11Oi0O liii11oi0oI0010I0i = ll0oOiiIi.I0010I0i();
/* 21 */                    boolean z = i1l1iI1Io.I00000oIO;
/* 23 */                    liii11oi0oI0010I0i.I0000Il00O();
/* 30 */                    ll0oOiiIi.I001IIilI0O((ll0oOiiIi) liii11oi0oI0010I0i.I00iiI, z);
/* 33 */                    liii11oi0oI0010I0i.I0000Il00O();
/* 40 */                    ll0oOiiIi.I001i1lo1io((ll0oOiiIi) liii11oi0oI0010I0i.I00iiI, str);
/* 43 */                    String strEncode = i01l10Oi.encode();
/* 47 */                    liii11oi0oI0010I0i.I0000Il00O();
/* 54 */                    ll0oOiiIi.I001iOo1i0O((ll0oOiiIi) liii11oi0oI0010I0i.I00iiI, strEncode);
/* 57 */                    int i = i1l1iI1Io.I00000oOI;
/* 59 */                    liii11oi0oI0010I0i.I0000Il00O();
/* 66 */                    ll0oOiiIi.I001l0I00((ll0oOiiIi) liii11oi0oI0010I0i.I00iiI, i);
/* 69 */                    float f = i1l1iI1Io.I0000Il00O;
/* 71 */                    liii11oi0oI0010I0i.I0000Il00O();
/* 78 */                    ll0oOiiIi.I001IO000((ll0oOiiIi) liii11oi0oI0010I0i.I00iiI, f);
/* 81 */                    int i2 = i1l1iI1Io.I0000O;
/* 83 */                    liii11oi0oI0010I0i.I0000Il00O();
/* 90 */                    ll0oOiiIi.I001i1O0Ol((ll0oOiiIi) liii11oi0oI0010I0i.I00iiI, i2);
/* 97 */                    ll0oOiiIi ll0ooiiii = (ll0oOiiIi) liii11oi0oI0010I0i.I00000oIO();
/* 107 */                   String strI000II = I000II(ll0ooiiii.I00111O(), ll0ooiiii.I0010o());
/* 111 */                   lo00l1i1O1O lo00l1i1o1oI0000oI00 = I0000oI00();
/* 115 */                   if (lo00l1i1o1oI0000oI00 != null) {
/* 125 */                       boolean z2 = false;
/* 130 */                       for (ll0oOiiIi ll0ooiiii2 : loo1ioloI0001Ioi1lo.I001i1lo1io()) {
/* 154 */                           if (strI000II.equals(I000II(ll0ooiiii2.I00111O(), ll0ooiiii2.I0010o()))) {
/* 156 */                               lo00l1i1o1oI0000oI00.I0000O(ll0ooiiii);
/* 159 */                               z2 = true;
                                    } else {
/* 163 */                               lo00l1i1o1oI0000oI00.I0000O(ll0ooiiii2);
                                    }
                                }
/* 167 */                       if (!z2) {
/* 169 */                           lo00l1i1o1oI0000oI00.I0000O(ll0ooiiii);
                                }
/* 182 */                       io0oo1l1Var.I0000Il00O(((loO1IolO) lo00l1i1o1oI0000oI00.I00000oIO()).I00000oOI());
                            }
                        }
                    } finally {
/* 189 */               io0oo1l1Var.I0000O();
                    }
                }

                public final lo00l1i1O1O I0000oI00() {
/* 1 */             OO11il0 oO11il0 = this.I00000oIO;
                    try {
/* 3 */                 lo00l1i1O1O lo00l1i1o1oI00100l0 = loO1IolO.I00100l0();
/* 10 */                String str = ((I1lI11l11OIo) oO11il0).I0000Il00O;
/* 12 */                lo00l1i1o1oI00100l0.I0000Il00O();
/* 19 */                loO1IolO.I00II0oii1o((loO1IolO) lo00l1i1o1oI00100l0.I00iiI, str);
/* 24 */                String str2 = ((I1lI11l11OIo) oO11il0).I0000O;
/* 26 */                lo00l1i1o1oI00100l0.I0000Il00O();
/* 33 */                loO1IolO.I001iOo1i0O((loO1IolO) lo00l1i1o1oI00100l0.I00iiI, str2);
/* 36 */                int i = Build.VERSION.SDK_INT;
/* 38 */                lo00l1i1o1oI00100l0.I0000Il00O();
/* 45 */                loO1IolO.I001l0I00((loO1IolO) lo00l1i1o1oI00100l0.I00iiI, i);
/* 48 */                String str3 = Build.HARDWARE;
/* 50 */                lo00l1i1o1oI00100l0.I0000Il00O();
/* 57 */                loO1IolO.I001lIiIIo1O((loO1IolO) lo00l1i1o1oI00100l0.I00iiI);
/* 60 */                String str4 = Build.FINGERPRINT;
/* 62 */                lo00l1i1o1oI00100l0.I0000Il00O();
/* 69 */                loO1IolO.I001lllioOl((loO1IolO) lo00l1i1o1oI00100l0.I00iiI);
/* 72 */                String strI0000O = I0000O();
/* 76 */                lo00l1i1o1oI00100l0.I0000Il00O();
/* 83 */                loO1IolO.I00II0Ol1O0l((loO1IolO) lo00l1i1o1oI00100l0.I00iiI, strI0000O);
/* 86 */                return lo00l1i1o1oI00100l0;
                    } catch (I01l1111 e) {
/* 92 */                ((IoIlOo1o0IIl) this.I00000oOI).I00II0oii1o(e);
/* 95 */                return null;
                    }
                }

                public final loO1IolO I0001Ioi1lo() throws IOException {
                    byte[] bArr;
/* 1 */             OO11il0 oO11il0 = this.I00000oIO;
/* 3 */             io0oo1l1 io0oo1l1Var = this.I0000Il00O;
/* 5 */             File fileI00000oIO = io0oo1l1Var.I00000oIO();
/* 9 */             I01l1o i01l1o = this.I00000oOI;
/* 12 */            if (fileI00000oIO == null) {
/* 22 */                ((IoIlOo1o0IIl) i01l1o).I00II0oii1o(new I01l1111(1, null));
/* 11 */                return null;
                    }
/* 32 */            "Reading benchmark result from file: ".concat(fileI00000oIO.toString());
/* 35 */            I000O01llI0();
/* 42 */            if (!fileI00000oIO.exists()) {
/* 44 */                I000O01llI0();
/* 47 */                return loO1IolO.I00100o1O0lo();
                    }
/* 56 */            if (io0oo1l1Var.I00000oIO() == null) {
/* 58 */                bArr = null;
                    } else {
                        try {
/* 62 */                    File fileI00000oIO2 = io0oo1l1Var.I00000oIO();
/* 66 */                    if (fileI00000oIO2 == null) {
/* 120 */                       throw null;
                            }
/* 68 */                    FileInputStream fileInputStream = new FileInputStream(fileI00000oIO2);
                            try {
/* 75 */                        bArr = new byte[fileInputStream.available()];
/* 78 */                        int i = 0;
                                while (true) {
/* 79 */                            int length = bArr.length;
/* 82 */                            int i2 = fileInputStream.read(bArr, i, length - i);
/* 86 */                            if (i2 <= 0) {
                                        break;
                                    }
/* 94 */                            i += i2;
/* 95 */                            int iAvailable = fileInputStream.available();
/* 100 */                           if (iAvailable > length - i) {
/* 103 */                               byte[] bArr2 = new byte[iAvailable + i];
/* 105 */                               System.arraycopy(bArr, 0, bArr2, 0, i);
/* 108 */                               bArr = bArr2;
                                    }
                                }
/* 88 */                        fileInputStream.close();
                            } finally {
                            }
                        } catch (IOException e) {
/* 135 */                   Log.e("LockableAtomicFile", "Failed to read from file: ".concat(String.valueOf(io0oo1l1Var.I0000Il00O)), e);
                        }
                    }
/* 139 */           if (bArr == null) {
/* 11 */                return null;
                    }
                    try {
/* 143 */               loO1IolO loo1ioloI0010I0i = loO1IolO.I0010I0i(bArr, ilI1iIO0oiIo.I00000oIO);
                        try {
/* 160 */                   if (((I1lI11l11OIo) oO11il0).I0000Il00O.equals(loo1ioloI0010I0i.I0010o()) && ((I1lI11l11OIo) oO11il0).I0000O.equals(loo1ioloI0010I0i.I00111O()) && Build.VERSION.SDK_INT == loo1ioloI0010I0i.I000oI1ioi() && Build.HARDWARE.equals(loo1ioloI0010I0i.I001IIilI0O()) && Build.FINGERPRINT.equals(loo1ioloI0010I0i.I001i1O0Ol())) {
/* 220 */                       if (I0000O().equals(loo1ioloI0010I0i.I001IO000())) {
/* 228 */                           "Succeeded reading valid benchmark results from file: ".concat(fileI00000oIO.toString());
/* 231 */                           I000O01llI0();
/* 234 */                           return loo1ioloI0010I0i;
                                }
                            }
                        } catch (I01l1111 e2) {
/* 238 */                   ((IoIlOo1o0IIl) i01l1o).I00II0oii1o(e2);
                        }
/* 241 */               I000O01llI0();
/* 244 */               return loO1IolO.I00100o1O0lo();
                    } catch (ill0ll01OOOO e3) {
/* 262 */               Log.e("MiniBenchPersistence", "Failed to parse proto from file: ".concat(fileI00000oIO.toString()), e3);
/* 265 */               return loO1IolO.I00100o1O0lo();
                    }
                }
            }
