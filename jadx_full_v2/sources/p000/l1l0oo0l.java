            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public abstract class l1l0oo0l {
                /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final boolean I00000oIO(IliIO10oO0 iliIO10oO0, I01oIoOI01l i01oIoOI01l) {
/* 5 */             int iOrdinal = iliIO10oO0.I01101IOlO().ordinal();
/* 9 */             if (iOrdinal != 0) {
/* 15 */                if (iOrdinal == 1) {
/* 54 */                    IliIO10oO0 iliIO10oO0I0000Il00O = iliI1i0.I0000Il00O(iliIO10oO0);
/* 60 */                    if (iliIO10oO0I0000Il00O == null) {
/* 126 */                       I000II.I001IO000("ActiveParent must have a focusedChild");
/* 12 */                        return false;
                            }
/* 66 */                    int iOrdinal2 = iliIO10oO0I0000Il00O.I01101IOlO().ordinal();
/* 70 */                    if (iOrdinal2 != 0) {
/* 72 */                        if (iOrdinal2 != 1) {
/* 74 */                            if (iOrdinal2 != 2) {
/* 76 */                                if (iOrdinal2 != 3) {
/* 78 */                                    I000II.I00000oIO();
/* 12 */                                    return false;
                                        }
/* 82 */                                I000II.I001IO000("ActiveParent must have a focusedChild");
/* 12 */                                return false;
                                    }
                                } else if (I00000oIO(iliIO10oO0I0000Il00O, i01oIoOI01l) || I0000Il00O(iliIO10oO0, iliIO10oO0I0000Il00O, 2, i01oIoOI01l) || (iliIO10oO0I0000Il00O.I010lI0oi().I00000oIO && ((Boolean) i01oIoOI01l.invoke(iliIO10oO0I0000Il00O)).booleanValue())) {
/* 14 */                            return true;
                                }
                            }
/* 121 */                   return I0000Il00O(iliIO10oO0, iliIO10oO0I0000Il00O, 2, i01oIoOI01l);
                        }
/* 17 */                if (iOrdinal != 2) {
/* 19 */                    if (iOrdinal != 3) {
/* 50 */                        I000II.I00000oIO();
/* 12 */                        return false;
                            }
/* 25 */                    if (!I0000O(iliIO10oO0, i01oIoOI01l)) {
/* 47 */                        if (!(iliIO10oO0.I010lI0oi().I00000oIO ? ((Boolean) i01oIoOI01l.invoke(iliIO10oO0)).booleanValue() : false)) {
/* 12 */                            return false;
                                }
                            }
/* 14 */                    return true;
                        }
                    }
/* 130 */           return I0000O(iliIO10oO0, i01oIoOI01l);
                }

                public static final boolean I00000oOI(IliIO10oO0 iliIO10oO0, I01oIoOI01l i01oIoOI01l) {
/* 5 */             int iOrdinal = iliIO10oO0.I01101IOlO().ordinal();
/* 9 */             if (iOrdinal != 0) {
/* 13 */                if (iOrdinal == 1) {
/* 49 */                    IliIO10oO0 iliIO10oO0I0000Il00O = iliI1i0.I0000Il00O(iliIO10oO0);
/* 53 */                    if (iliIO10oO0I0000Il00O != null) {
                                return I00000oOI(iliIO10oO0I0000Il00O, i01oIoOI01l) || I0000Il00O(iliIO10oO0, iliIO10oO0I0000Il00O, 1, i01oIoOI01l);
                            }
/* 72 */                    I000II.I001IO000("ActiveParent must have a focusedChild");
/* 11 */                    return false;
                        }
/* 16 */                if (iOrdinal != 2) {
/* 19 */                    if (iOrdinal == 3) {
                                return iliIO10oO0.I010lI0oi().I00000oIO ? ((Boolean) i01oIoOI01l.invoke(iliIO10oO0)).booleanValue() : I0000oI00(iliIO10oO0, i01oIoOI01l);
                            }
/* 45 */                    I000II.I00000oIO();
/* 11 */                    return false;
                        }
                    }
/* 76 */            return I0000oI00(iliIO10oO0, i01oIoOI01l);
                }

                public static final boolean I0000Il00O(IliIO10oO0 iliIO10oO0, IliIO10oO0 iliIO10oO02, int i, I01oIoOI01l i01oIoOI01l) {
/* 5 */             if (I0001Ioi1lo(iliIO10oO0, iliIO10oO02, i, i01oIoOI01l)) {
/* 7 */                 return true;
                    }
/* 21 */            IliIO10oO0 iliIO10oO0I000II = ((Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO0)).getFocusOwner()).I000II();
/* 28 */            IOOllI0o iOOllI0o = new IOOllI0o(4);
/* 31 */            iOOllI0o.I00iiO = iliIO10oO0I000II;
/* 33 */            iOOllI0o.I00iio = iliIO10oO0;
/* 35 */            iOOllI0o.I00ilI0I1 = iliIO10oO02;
/* 37 */            iOOllI0o.I00iiI = i;
/* 39 */            iOOllI0o.I00ilO0 = i01oIoOI01l;
/* 41 */            VarHandle.storeStoreFence();
/* 48 */            Boolean bool = (Boolean) iOOoi1OOlo.I00000oIO(iliIO10oO0, i, iOOllI0o);
/* 50 */            if (bool != null) {
/* 52 */                return bool.booleanValue();
                    }
/* 57 */            return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
                public static final boolean I0000O(IliIO10oO0 iliIO10oO0, I01oIoOI01l i01oIoOI01l) {
/* 3 */             IliIO10oO0[] iliIO10oO0Arr = new IliIO10oO0[16];
/* 9 */             if (!iliIO10oO0.I00iOIl.I00lll10) {
/* 13 */                IolioOO1.I0000Il00O("visitChildren called on an unattached node");
                    }
/* 20 */            OI110O0 oi110o0 = new OI110O0(new O1ooOo[16]);
/* 23 */            O1ooOo o1ooOo = iliIO10oO0.I00iOIl;
/* 25 */            O1ooOo o1ooOo2 = o1ooOo.I00ilO0;
/* 28 */            if (o1ooOo2 == null) {
/* 30 */                il0lI1i1olii.I00000oIO(oi110o0, o1ooOo);
                    } else {
/* 35 */                oi110o0.I00000oOI(o1ooOo2);
                    }
/* 33 */            int i = 0;
                    while (true) {
/* 39 */                int i2 = oi110o0.I00iiO;
/* 42 */                if (i2 == 0) {
                            break;
                        }
/* 50 */                O1ooOo o1ooOoI0000Il00O = (O1ooOo) oi110o0.I000l1(i2 - 1);
/* 56 */                if ((o1ooOoI0000Il00O.I00iio & Barcode.FORMAT_UPC_E) == 0) {
/* 58 */                    il0lI1i1olii.I00000oIO(oi110o0, o1ooOoI0000Il00O);
                        } else {
                            while (true) {
/* 62 */                        if (o1ooOoI0000Il00O == null) {
                                    break;
                                }
/* 68 */                        if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 71 */                            OI110O0 oi110o02 = null;
/* 72 */                            while (o1ooOoI0000Il00O != null) {
/* 76 */                                if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
/* 78 */                                    IliIO10oO0 iliIO10oO02 = (IliIO10oO0) o1ooOoI0000Il00O;
/* 80 */                                    int i3 = i + 1;
/* 83 */                                    if (iliIO10oO0Arr.length < i3) {
/* 85 */                                        int length = iliIO10oO0Arr.length;
/* 92 */                                        ?? r10 = new Object[Math.max(i3, length * 2)];
/* 94 */                                        System.arraycopy(iliIO10oO0Arr, 0, r10, 0, length);
/* 97 */                                        iliIO10oO0Arr = r10;
                                            }
/* 98 */                                    iliIO10oO0Arr[i] = iliIO10oO02;
/* 100 */                                   i = i3;
                                        } else if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 117 */                                   int i4 = 0;
/* 118 */                                   for (O1ooOo o1ooOo3 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo3 != null; o1ooOo3 = o1ooOo3.I00ilO0) {
/* 124 */                                       if ((o1ooOo3.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 126 */                                           i4++;
/* 128 */                                           if (i4 == 1) {
/* 130 */                                               o1ooOoI0000Il00O = o1ooOo3;
                                                    } else {
/* 132 */                                               if (oi110o02 == null) {
/* 138 */                                                   oi110o02 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 141 */                                               if (o1ooOoI0000Il00O != null) {
/* 143 */                                                   oi110o02.I00000oOI(o1ooOoI0000Il00O);
/* 146 */                                                   o1ooOoI0000Il00O = null;
                                                        }
/* 147 */                                               oi110o02.I00000oOI(o1ooOo3);
                                                    }
                                                }
                                            }
/* 153 */                                   if (i4 == 1) {
                                            }
                                        }
/* 156 */                               o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o02);
                                    }
                                } else {
/* 161 */                           o1ooOoI0000Il00O = o1ooOoI0000Il00O.I00ilO0;
                                }
                            }
                        }
                    }
/* 166 */           Arrays.sort(iliIO10oO0Arr, 0, i, IliIiio1.I00iiI);
/* 169 */           int i5 = i - 1;
/* 171 */           if (i5 < iliIO10oO0Arr.length) {
/* 173 */               while (i5 >= 0) {
/* 175 */                   IliIO10oO0 iliIO10oO03 = iliIO10oO0Arr[i5];
/* 183 */                   if (iliI1i0.I0000O(iliIO10oO03) && I00000oIO(iliIO10oO03, i01oIoOI01l)) {
/* 41 */                        return true;
                            }
                            i5--;
                        }
                    }
/* 27 */            return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
                public static final boolean I0000oI00(IliIO10oO0 iliIO10oO0, I01oIoOI01l i01oIoOI01l) {
/* 3 */             IliIO10oO0[] iliIO10oO0Arr = new IliIO10oO0[16];
/* 9 */             if (!iliIO10oO0.I00iOIl.I00lll10) {
/* 13 */                IolioOO1.I0000Il00O("visitChildren called on an unattached node");
                    }
/* 20 */            OI110O0 oi110o0 = new OI110O0(new O1ooOo[16]);
/* 23 */            O1ooOo o1ooOo = iliIO10oO0.I00iOIl;
/* 25 */            O1ooOo o1ooOo2 = o1ooOo.I00ilO0;
/* 28 */            if (o1ooOo2 == null) {
/* 30 */                il0lI1i1olii.I00000oIO(oi110o0, o1ooOo);
                    } else {
/* 35 */                oi110o0.I00000oOI(o1ooOo2);
                    }
/* 33 */            int i = 0;
                    while (true) {
/* 39 */                int i2 = oi110o0.I00iiO;
/* 42 */                if (i2 == 0) {
                            break;
                        }
/* 50 */                O1ooOo o1ooOoI0000Il00O = (O1ooOo) oi110o0.I000l1(i2 - 1);
/* 56 */                if ((o1ooOoI0000Il00O.I00iio & Barcode.FORMAT_UPC_E) == 0) {
/* 58 */                    il0lI1i1olii.I00000oIO(oi110o0, o1ooOoI0000Il00O);
                        } else {
                            while (true) {
/* 62 */                        if (o1ooOoI0000Il00O == null) {
                                    break;
                                }
/* 68 */                        if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 71 */                            OI110O0 oi110o02 = null;
/* 72 */                            while (o1ooOoI0000Il00O != null) {
/* 76 */                                if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
/* 78 */                                    IliIO10oO0 iliIO10oO02 = (IliIO10oO0) o1ooOoI0000Il00O;
/* 80 */                                    int i3 = i + 1;
/* 83 */                                    if (iliIO10oO0Arr.length < i3) {
/* 85 */                                        int length = iliIO10oO0Arr.length;
/* 92 */                                        ?? r10 = new Object[Math.max(i3, length * 2)];
/* 94 */                                        System.arraycopy(iliIO10oO0Arr, 0, r10, 0, length);
/* 97 */                                        iliIO10oO0Arr = r10;
                                            }
/* 98 */                                    iliIO10oO0Arr[i] = iliIO10oO02;
/* 100 */                                   i = i3;
                                        } else if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 117 */                                   int i4 = 0;
/* 118 */                                   for (O1ooOo o1ooOo3 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo3 != null; o1ooOo3 = o1ooOo3.I00ilO0) {
/* 124 */                                       if ((o1ooOo3.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 126 */                                           i4++;
/* 128 */                                           if (i4 == 1) {
/* 130 */                                               o1ooOoI0000Il00O = o1ooOo3;
                                                    } else {
/* 132 */                                               if (oi110o02 == null) {
/* 138 */                                                   oi110o02 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 141 */                                               if (o1ooOoI0000Il00O != null) {
/* 143 */                                                   oi110o02.I00000oOI(o1ooOoI0000Il00O);
/* 146 */                                                   o1ooOoI0000Il00O = null;
                                                        }
/* 147 */                                               oi110o02.I00000oOI(o1ooOo3);
                                                    }
                                                }
                                            }
/* 153 */                                   if (i4 == 1) {
                                            }
                                        }
/* 156 */                               o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o02);
                                    }
                                } else {
/* 161 */                           o1ooOoI0000Il00O = o1ooOoI0000Il00O.I00ilO0;
                                }
                            }
                        }
                    }
/* 166 */           Arrays.sort(iliIO10oO0Arr, 0, i, IliIiio1.I00iiI);
/* 170 */           for (int i5 = 0; i5 < i; i5++) {
/* 172 */               IliIO10oO0 iliIO10oO03 = iliIO10oO0Arr[i5];
/* 180 */               if (iliI1i0.I0000O(iliIO10oO03) && I00000oOI(iliIO10oO03, i01oIoOI01l)) {
/* 41 */                    return true;
                        }
                    }
/* 27 */            return false;
                }

                /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
                
                    return true;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x019b A[EDGE_INSN: B:157:0x019b->B:127:0x019b BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
                /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final boolean I0001Ioi1lo(IliIO10oO0 iliIO10oO0, IliIO10oO0 iliIO10oO02, int i, I01oIoOI01l i01oIoOI01l) {
                    O1ooOo o1ooOo;
                    O0iiOioolIi o0iiOioolIiI000O01llI0;
                    IIlOoolol0ll iIlOoolol0ll;
/* 8 */             if (iliIO10oO0.I01101IOlO() != IliI0101O0Oi.I00iiI) {
/* 435 */               I000II.I001IO000("This function should only be used within a parent that has focus.");
/* 7 */                 return false;
                    }
/* 12 */            IliIO10oO0[] iliIO10oO0Arr = new IliIO10oO0[16];
/* 18 */            if (!iliIO10oO0.I00iOIl.I00lll10) {
/* 22 */                IolioOO1.I0000Il00O("visitChildren called on an unattached node");
                    }
/* 29 */            OI110O0 oi110o0 = new OI110O0(new O1ooOo[16]);
/* 32 */            O1ooOo o1ooOo2 = iliIO10oO0.I00iOIl;
/* 34 */            O1ooOo o1ooOo3 = o1ooOo2.I00ilO0;
/* 36 */            if (o1ooOo3 == null) {
/* 38 */                il0lI1i1olii.I00000oIO(oi110o0, o1ooOo2);
                    } else {
/* 43 */                oi110o0.I00000oOI(o1ooOo3);
                    }
/* 41 */            int i2 = 0;
                    while (true) {
/* 47 */                int i3 = oi110o0.I00iiO;
/* 49 */                o1ooOo = null;
/* 51 */                if (i3 == 0) {
                            break;
                        }
/* 59 */                O1ooOo o1ooOoI0000Il00O = (O1ooOo) oi110o0.I000l1(i3 - 1);
/* 65 */                if ((o1ooOoI0000Il00O.I00iio & Barcode.FORMAT_UPC_E) == 0) {
/* 67 */                    il0lI1i1olii.I00000oIO(oi110o0, o1ooOoI0000Il00O);
                        } else {
                            while (true) {
/* 71 */                        if (o1ooOoI0000Il00O == null) {
                                    break;
                                }
/* 77 */                        if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 79 */                            OI110O0 oi110o02 = null;
/* 80 */                            while (o1ooOoI0000Il00O != null) {
/* 84 */                                if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
/* 86 */                                    IliIO10oO0 iliIO10oO03 = (IliIO10oO0) o1ooOoI0000Il00O;
/* 88 */                                    int i4 = i2 + 1;
/* 91 */                                    if (iliIO10oO0Arr.length < i4) {
/* 93 */                                        int length = iliIO10oO0Arr.length;
/* 100 */                                       ?? r11 = new Object[Math.max(i4, length * 2)];
/* 102 */                                       System.arraycopy(iliIO10oO0Arr, 0, r11, 0, length);
/* 105 */                                       iliIO10oO0Arr = r11;
                                            }
/* 106 */                                   iliIO10oO0Arr[i2] = iliIO10oO03;
/* 108 */                                   i2 = i4;
                                        } else if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 125 */                                   int i5 = 0;
/* 126 */                                   for (O1ooOo o1ooOo4 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo4 != null; o1ooOo4 = o1ooOo4.I00ilO0) {
/* 132 */                                       if ((o1ooOo4.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 134 */                                           i5++;
/* 136 */                                           if (i5 == 1) {
/* 138 */                                               o1ooOoI0000Il00O = o1ooOo4;
                                                    } else {
/* 140 */                                               if (oi110o02 == null) {
/* 146 */                                                   oi110o02 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 149 */                                               if (o1ooOoI0000Il00O != null) {
/* 151 */                                                   oi110o02.I00000oOI(o1ooOoI0000Il00O);
/* 154 */                                                   o1ooOoI0000Il00O = null;
                                                        }
/* 155 */                                               oi110o02.I00000oOI(o1ooOo4);
                                                    }
                                                }
                                            }
/* 161 */                                   if (i5 == 1) {
                                            }
                                        }
/* 164 */                               o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o02);
                                    }
                                } else {
/* 169 */                           o1ooOoI0000Il00O = o1ooOoI0000Il00O.I00ilO0;
                                }
                            }
                        }
                    }
/* 174 */           Arrays.sort(iliIO10oO0Arr, 0, i2, IliIiio1.I00iiI);
/* 177 */           if (i != 1) {
/* 224 */               if (i != 2) {
/* 429 */                   I000II.I001IO000("This function should only be used for 1-D focus search");
/* 7 */                     return false;
                        }
/* 226 */               IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, i2);
/* 230 */               int i6 = iooO11lI000O01llI0.I00iOIl;
/* 232 */               int i7 = iooO11lI000O01llI0.I00iiI;
/* 234 */               if (i6 <= i7) {
/* 236 */                   boolean z = false;
                            while (true) {
/* 237 */                       if (z) {
/* 239 */                           IliIO10oO0 iliIO10oO04 = iliIO10oO0Arr[i7];
/* 247 */                           if (iliI1i0.I0000O(iliIO10oO04) && I00000oIO(iliIO10oO04, i01oIoOI01l)) {
                                        break;
                                    }
                                }
/* 262 */                       if (O0000Ioio00.I0000O(iliIO10oO0Arr[i7], iliIO10oO02)) {
/* 264 */                           z = true;
                                }
/* 265 */                       if (i7 == i6) {
                                    break;
                                }
                                i7--;
                            }
                        }
/* 270 */               if (i != 1) {
/* 286 */                   if (!iliIO10oO0.I00iOIl.I00lll10) {
                            }
/* 295 */                   O1ooOo o1ooOo5 = iliIO10oO0.I00iOIl.I00ilI0I1;
/* 297 */                   o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0);
                            loop5: while (true) {
/* 301 */                       if (o0iiOioolIiI000O01llI0 == null) {
                                }
                            }
/* 412 */                   if (o1ooOo != null) {
                            }
                        }
/* 7 */                 return false;
                    }
/* 179 */           IooO11l iooO11lI000O01llI02 = lIiioliIlo.I000O01llI0(0, i2);
/* 183 */           int i8 = iooO11lI000O01llI02.I00iOIl;
/* 185 */           int i9 = iooO11lI000O01llI02.I00iiI;
/* 187 */           if (i8 <= i9) {
/* 189 */               boolean z2 = false;
                        while (true) {
/* 190 */                   if (z2) {
/* 192 */                       IliIO10oO0 iliIO10oO05 = iliIO10oO0Arr[i8];
/* 200 */                       if (iliI1i0.I0000O(iliIO10oO05) && I00000oOI(iliIO10oO05, i01oIoOI01l)) {
                                    break;
                                }
                            }
/* 215 */                   if (O0000Ioio00.I0000O(iliIO10oO0Arr[i8], iliIO10oO02)) {
/* 217 */                       z2 = true;
                            }
/* 218 */                   if (i8 == i9) {
                                break;
                            }
/* 220 */                   i8++;
                        }
                    }
/* 270 */           if (i != 1 && iliIO10oO0.I010lI0oi().I00000oIO) {
/* 286 */               if (!iliIO10oO0.I00iOIl.I00lll10) {
/* 290 */                   IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                        }
/* 295 */               O1ooOo o1ooOo52 = iliIO10oO0.I00iOIl.I00ilI0I1;
/* 297 */               o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0);
                        loop5: while (true) {
/* 301 */                   if (o0iiOioolIiI000O01llI0 == null) {
                                break;
                            }
/* 313 */                   if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & Barcode.FORMAT_UPC_E) != 0) {
/* 315 */                       while (o1ooOo52 != null) {
/* 321 */                           if ((o1ooOo52.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 323 */                               O1ooOo o1ooOoI0000Il00O2 = o1ooOo52;
/* 324 */                               OI110O0 oi110o03 = null;
/* 325 */                               while (o1ooOoI0000Il00O2 != null) {
/* 329 */                                   if (o1ooOoI0000Il00O2 instanceof IliIO10oO0) {
/* 331 */                                       o1ooOo = o1ooOoI0000Il00O2;
                                                break loop5;
                                            }
/* 337 */                                   if ((o1ooOoI0000Il00O2.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O2 instanceof IiIioO0ol1oI)) {
/* 348 */                                       int i10 = 0;
/* 349 */                                       for (O1ooOo o1ooOo6 = ((IiIioO0ol1oI) o1ooOoI0000Il00O2).I00o0l1o1o0; o1ooOo6 != null; o1ooOo6 = o1ooOo6.I00ilO0) {
/* 355 */                                           if ((o1ooOo6.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 357 */                                               i10++;
/* 359 */                                               if (i10 == 1) {
/* 361 */                                                   o1ooOoI0000Il00O2 = o1ooOo6;
                                                        } else {
/* 363 */                                                   if (oi110o03 == null) {
/* 369 */                                                       oi110o03 = new OI110O0(new O1ooOo[16]);
                                                            }
/* 372 */                                                   if (o1ooOoI0000Il00O2 != null) {
/* 374 */                                                       oi110o03.I00000oOI(o1ooOoI0000Il00O2);
/* 377 */                                                       o1ooOoI0000Il00O2 = null;
                                                            }
/* 378 */                                                   oi110o03.I00000oOI(o1ooOo6);
                                                        }
                                                    }
                                                }
/* 384 */                                       if (i10 == 1) {
                                                }
                                            }
/* 387 */                                   o1ooOoI0000Il00O2 = il0lI1i1olii.I0000Il00O(oi110o03);
                                        }
                                    }
/* 392 */                           o1ooOo52 = o1ooOo52.I00ilI0I1;
                                }
                            }
/* 395 */                   o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 410 */                   o1ooOo52 = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                        }
/* 412 */               if (o1ooOo != null) {
/* 421 */                   return ((Boolean) i01oIoOI01l.invoke(iliIO10oO0)).booleanValue();
                        }
                    }
/* 7 */             return false;
                }
            }
