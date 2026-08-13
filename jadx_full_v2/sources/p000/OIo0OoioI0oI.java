            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class OIo0OoioI0oI implements IIi0O1OOO1i0 {
                public OIllIlO1 I00iOIl;

                public OIo0OoioI0oI(IIi0io1lIo iIi0io1lIo, IIi0I0I0o iIi0I0I0o) {
/* 9 */             this.I00iOIl = new OIllIlO1(iIi0io1lIo);
/* 17 */            iIi0io1lIo.I010l10O(IIi0I0I0o.I0IilI00l, IIi0I0I0o.I0IloIOoo.I00iOIl);
/* 24 */            iIi0io1lIo.I010l10O(IIi0I0I0o.I0Ii0oI1, iIi0I0I0o.I00iOIl);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static OIo0OoioI0oI I0000oI00(IIOoOiOI iIOoOiOI, OIloii oIloii) throws IOException {
                    ArrayList arrayList;
/* 1 */             IIOooOII iIOooOIII010l1ol111 = null;
/* 2 */             if (iIOoOiOI == null) {
/* 1 */                 return null;
                    }
/* 7 */             if (!(iIOoOiOI instanceof IIi0io1lIo)) {
/* 310 */               IioIoO10iOiI.I000OOo1O("Unexpected object type: ".concat(iIOoOiOI.getClass().getName()));
/* 1 */                 return null;
                    }
/* 9 */             IIi0io1lIo iIi0io1lIo = (IIi0io1lIo) iIOoOiOI;
/* 11 */            IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I0Ii0oI1;
/* 13 */            String strI010101Oo1lO = iIi0io1lIo.I010101Oo1lO(iIi0I0I0o);
/* 17 */            IIi0I0I0o iIi0I0I0o2 = IIi0I0I0o.I01l1111;
/* 25 */            if (!iIi0I0I0o2.I00iOIl.equals(strI010101Oo1lO)) {
/* 230 */               if (IIi0I0I0o.I01iOOoiOI.I00iOIl.equals(strI010101Oo1lO)) {
/* 234 */                   IoIlOo1o0IIl ioIlOo1o0IIl = oIloii != null ? oIloii.I00iiI : null;
/* 238 */                   IIOoi0ooOoO iIOoi0ooOoOI00lll10 = iIi0io1lIo.I00lll10(IIi0I0I0o.I01ii1IIl);
                            return (iIOoi0ooOoOI00lll10 == null || !IIi0I0I0o.I0Iiil0.equals(iIOoi0ooOoOI00lll10.I00o0iI0io1(IIi0I0I0o.I0IIOlio))) ? new OIllIolIo(iIi0io1lIo, ioIlOo1o0IIl) : new OIlooi01(iIi0io1lIo, ioIlOo1o0IIl);
                        }
/* 270 */               IIi0I0I0o iIi0I0I0o3 = IIi0I0I0o.I0I1ll0io;
/* 278 */               if (iIi0I0I0o3.I00iOIl.equals(strI010101Oo1lO)) {
/* 282 */                   return new OIloIII01l(iIi0io1lIo, iIi0I0I0o3);
                        }
/* 292 */               IioIoO10iOiI.I000OOo1O(IIl001iO0Io.I000o00OoI0I("Invalid XObject Subtype: ", strI010101Oo1lO));
/* 1 */                 return null;
                    }
/* 31 */            OIllIlO1 oIllIlO1 = new OIllIlO1(iIi0io1lIo);
/* 34 */            OIllii oIllii = new OIllii();
/* 37 */            oIllii.I00iOIl = oIllIlO1;
/* 45 */            iIi0io1lIo.I010l10O(IIi0I0I0o.I0IilI00l, IIi0I0I0o.I0IloIOoo.I00iOIl);
/* 50 */            iIi0io1lIo.I010l10O(iIi0I0I0o, iIi0I0I0o2.I00iOIl);
/* 53 */            IIi0I0I0o iIi0I0I0o4 = IIi0I0I0o.I01OOiI1o;
/* 55 */            IIOoOiOI iIOoOiOII00oII = iIi0io1lIo.I00oII(iIi0I0I0o4);
/* 61 */            if (iIOoOiOII00oII instanceof IIi0I0I0o) {
/* 63 */                IIi0I0I0o iIi0I0I0o5 = (IIi0I0I0o) iIOoOiOII00oII;
/* 67 */                IIOoOOOol iIOoOOOol = new IIOoOOOol();
/* 71 */                iIOoOOOol.I00iiO = false;
/* 75 */                IIOoIilO iIOoIilO = new IIOoIilO();
/* 78 */                iIOoOOOol.I00iOIl = iIOoIilO;
/* 80 */                iIOoIilO.I00ioIO(iIi0I0I0o5);
/* 85 */                ArrayList arrayList2 = new ArrayList();
/* 88 */                iIOoOOOol.I00iiI = arrayList2;
/* 90 */                arrayList2.add(iIi0I0I0o5);
/* 93 */                iIOoOOOol.I00iio = iIi0io1lIo;
/* 95 */                iIOoOOOol.I00ilI0I1 = iIi0I0I0o4;
/* 97 */                VarHandle.storeStoreFence();
                        arrayList = iIOoOOOol;
                    } else {
/* 115 */               arrayList = iIOoOiOII00oII instanceof IIOoIilO ? new ArrayList(((IIOoIilO) iIOoOiOII00oII).I00iOIl) : null;
                    }
/* 116 */           if (arrayList != null && !arrayList.isEmpty() && IIi0I0I0o.I01lOOlO0o.equals(arrayList.get(arrayList.size() - 1))) {
/* 156 */               Iterator it = Arrays.asList(IIi0I0I0o.I0IlOO10Ii1, IIi0I0I0o.I01il1IlO1, IIi0I0I0o.I0110OiO).iterator();
/* 164 */               while (it.hasNext()) {
/* 178 */                   if (!iIi0io1lIo.I00iOIl.containsKey((IIi0I0I0o) it.next())) {
                                try {
/* 180 */                           iIOooOIII010l1ol111 = iIi0io1lIo.I010l1ol111();
/* 184 */                           List list = iIOooOIII010l1ol111.I00iOIl;
/* 209 */                           iIi0io1lIo.I00ioIO((list.isEmpty() ? Ii1i1il100.I00000oOI : (Ii1i1il100) list.get(list.size() - 1)).I00000oIO);
/* 215 */                           return oIllii;
                                } finally {
/* 217 */                           io0iolo.I00000oOI(iIOooOIII010l1ol111);
                                }
                            }
                        }
                    }
/* 221 */           return oIllii;
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
/* 5 */             return (IIi0io1lIo) this.I00iOIl.I00iiI;
                }
            }
