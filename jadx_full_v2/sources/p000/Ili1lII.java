            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class Ili1lII {
                public static final Ili1lII I00000oOI = new Ili1lII();
                public static final Ili1lII I0000Il00O = new Ili1lII();
                public static final Ili1lII I0000O = new Ili1lII();
                public final OI110O0 I00000oIO = new OI110O0(new Ili1oii1llI[16]);

                /* JADX WARN: Code restructure failed: missing block: B:69:0x004b, code lost:
                
                    continue;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oIO(Ili1lII ili1lII) {
/* 1 */             ili1lII.getClass();
/* 8 */             if (ili1lII == I00000oOI) {
/* 196 */               I000II.I001IO000("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
/* 437 */               return;
                    }
/* 12 */            if (ili1lII == I0000Il00O) {
/* 192 */               I000II.I001IO000("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
/* 195 */               return;
                    }
/* 14 */            OI110O0 oi110o0 = ili1lII.I00000oIO;
/* 16 */            int i = oi110o0.I00iiO;
/* 18 */            if (i == 0) {
/* 24 */                System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
/* 27 */                return;
                    }
/* 28 */            Object[] objArr = oi110o0.I00iOIl;
/* 32 */            for (int i2 = 0; i2 < i; i2++) {
/* 36 */                IiIill0O0li1 iiIill0O0li1 = (Ili1oii1llI) objArr[i2];
/* 45 */                if (!((O1ooOo) iiIill0O0li1).I00iOIl.I00lll10) {
/* 49 */                    IolioOO1.I0000Il00O("visitChildren called on an unattached node");
                        }
/* 58 */                OI110O0 oi110o02 = new OI110O0(new O1ooOo[16]);
/* 63 */                O1ooOo o1ooOo = ((O1ooOo) iiIill0O0li1).I00iOIl;
/* 65 */                O1ooOo o1ooOo2 = o1ooOo.I00ilO0;
/* 67 */                if (o1ooOo2 == null) {
/* 69 */                    il0lI1i1olii.I00000oIO(oi110o02, o1ooOo);
                        } else {
/* 73 */                    oi110o02.I00000oOI(o1ooOo2);
                        }
                        while (true) {
/* 76 */                    int i3 = oi110o02.I00iiO;
/* 78 */                    if (i3 != 0) {
/* 86 */                        O1ooOo o1ooOoI0000Il00O = (O1ooOo) oi110o02.I000l1(i3 - 1);
/* 92 */                        if ((o1ooOoI0000Il00O.I00iio & Barcode.FORMAT_UPC_E) == 0) {
/* 94 */                            il0lI1i1olii.I00000oIO(oi110o02, o1ooOoI0000Il00O);
                                } else {
                                    while (true) {
/* 98 */                                if (o1ooOoI0000Il00O == null) {
                                            break;
                                        }
/* 104 */                               if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 107 */                                   OI110O0 oi110o03 = null;
/* 108 */                                   while (o1ooOoI0000Il00O != null) {
/* 112 */                                       if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
/* 121 */                                           if (((IliIO10oO0) o1ooOoI0000Il00O).I0110OiO(7)) {
                                                        break;
                                                    }
                                                } else if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 139 */                                           int i4 = 0;
/* 141 */                                           for (O1ooOo o1ooOo3 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo3 != null; o1ooOo3 = o1ooOo3.I00ilO0) {
/* 147 */                                               if ((o1ooOo3.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 149 */                                                   i4++;
/* 151 */                                                   if (i4 == 1) {
/* 153 */                                                       o1ooOoI0000Il00O = o1ooOo3;
                                                            } else {
/* 155 */                                                       if (oi110o03 == null) {
/* 161 */                                                           oi110o03 = new OI110O0(new O1ooOo[16]);
                                                                }
/* 164 */                                                       if (o1ooOoI0000Il00O != null) {
/* 166 */                                                           oi110o03.I00000oOI(o1ooOoI0000Il00O);
/* 169 */                                                           o1ooOoI0000Il00O = null;
                                                                }
/* 170 */                                                       oi110o03.I00000oOI(o1ooOo3);
                                                            }
                                                        }
                                                    }
/* 176 */                                           if (i4 == 1) {
                                                    }
                                                }
/* 179 */                                       o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o03);
                                            }
                                        } else {
/* 184 */                                   o1ooOoI0000Il00O = o1ooOoI0000Il00O.I00ilO0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
