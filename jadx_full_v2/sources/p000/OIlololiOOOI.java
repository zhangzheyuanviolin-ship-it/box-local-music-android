            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
/* 15 */    public abstract class OIlololiOOOI implements IIi0O1OOO1i0 {
                private final IIOoi0ooOoO I00iOIl;

                public OIlololiOOOI(String str) {
/* 6 */             IIOoi0ooOoO iIOoi0ooOoO = new IIOoi0ooOoO();
/* 9 */             this.I00iOIl = iIOoi0ooOoO;
/* 13 */            iIOoi0ooOoO.I010l10O(IIi0I0I0o.I0IilI00l, str);
                }

                public static OIlololiOOOI I0000O(IIOoi0ooOoO iIOoi0ooOoO) {
/* 3 */             String strI010101Oo1lO = iIOoi0ooOoO.I010101Oo1lO(IIi0I0I0o.I0IilI00l);
/* 13 */            if ("StructTreeRoot".equals(strI010101Oo1lO)) {
/* 17 */                return new OIloo1(iIOoi0ooOoO);
                    }
/* 21 */            if (strI010101Oo1lO == null || OIlolo.I00iiI.equals(strI010101Oo1lO)) {
/* 41 */                return new OIlolo(iIOoi0ooOoO);
                    }
/* 34 */            I000II.I000iOII("Dictionary must not include a Type entry with a value that is neither StructTreeRoot nor StructElem.");
/* 37 */            return null;
                }

                private IIi0O1OOO1i0 I0001Ioi1lo(IIOoi0ooOoO iIOoi0ooOoO) {
/* 3 */             String strI010101Oo1lO = iIOoi0ooOoO.I010101Oo1lO(IIi0I0I0o.I0IilI00l);
/* 7 */             if (strI010101Oo1lO == null || OIlolo.I00iiI.equals(strI010101Oo1lO)) {
/* 50 */                return new OIlolo(iIOoi0ooOoO);
                    }
/* 24 */            if (OIlloo11OoI.I00iiI.equals(strI010101Oo1lO)) {
/* 28 */                return new OIlloo11OoI(iIOoi0ooOoO);
                    }
/* 38 */            if (OIlloOIiIi1.I00iiI.equals(strI010101Oo1lO)) {
/* 42 */                return new OIlloOIiIi1(iIOoi0ooOoO);
                    }
/* 46 */            return null;
                }

                public void I00000oIO(IIOoOiOI iIOoOiOI) {
/* 1 */             if (iIOoOiOI == null) {
/* 3 */                 return;
                    }
/* 4 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 8 */             IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I01ll0oooOoO;
/* 10 */            IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoOI00Io1lO.I00oII(iIi0I0I0o);
/* 14 */            if (iIOoOiOII00oII == null) {
/* 20 */                I00Io1lO().I010iIIOlo(iIi0I0I0o, iIOoOiOI);
/* 23 */                return;
                    }
/* 26 */            if (iIOoOiOII00oII instanceof IIOoIilO) {
/* 30 */                ((IIOoIilO) iIOoOiOII00oII).I00ioIO(iIOoOiOI);
/* 33 */                return;
                    }
/* 36 */            IIOoIilO iIOoIilO = new IIOoIilO();
/* 39 */            iIOoIilO.I00ioIO(iIOoOiOII00oII);
/* 42 */            iIOoIilO.I00ioIO(iIOoOiOI);
/* 49 */            I00Io1lO().I010iIIOlo(iIi0I0I0o, iIOoIilO);
                }

                public void I00000oOI(OIlolo oIlolo) {
/* 1 */             I0000Il00O(oIlolo);
/* 4 */             oIlolo.I00OloOo(this);
                }

                public void I0000Il00O(IIi0O1OOO1i0 iIi0O1OOO1i0) {
/* 1 */             if (iIi0O1OOO1i0 == null) {
/* 3 */                 return;
                    }
/* 8 */             I00000oIO(iIi0O1OOO1i0.I00Io1lO());
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I0000oI00(IIOoOiOI iIOoOiOI) {
                    IIOoi0ooOoO iIOoi0ooOoO;
/* 4 */             if (iIOoOiOI instanceof IIOoi0ooOoO) {
/* 7 */                 iIOoi0ooOoO = (IIOoi0ooOoO) iIOoOiOI;
                    } else if (iIOoOiOI instanceof IIi0O10I) {
/* 17 */                IIOoOiOI iIOoOiOI2 = ((IIi0O10I) iIOoOiOI).I00iOIl;
/* 26 */                iIOoi0ooOoO = iIOoOiOI2 instanceof IIOoi0ooOoO ? (IIOoi0ooOoO) iIOoOiOI2 : null;
                    }
/* 27 */            if (iIOoi0ooOoO != null) {
/* 29 */                return I0001Ioi1lo(iIOoi0ooOoO);
                    }
/* 36 */            if (iIOoOiOI instanceof IIOool) {
/* 43 */                return Integer.valueOf((int) ((IIOool) iIOoOiOI).I00iOIl);
                    }
/* 3 */             return null;
                }

                @Override
                public IIOoi0ooOoO I00Io1lO() {
/* 1 */             return this.I00iOIl;
                }

                public List<Object> I000O01llI0() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            IIOoOiOI iIOoOiOII00oII = I00Io1lO().I00oII(IIi0I0I0o.I01ll0oooOoO);
/* 18 */            if (iIOoOiOII00oII instanceof IIOoIilO) {
/* 24 */                Iterator it = ((IIOoIilO) iIOoOiOII00oII).I00iOIl.iterator();
/* 32 */                while (it.hasNext()) {
/* 40 */                    Object objI0000oI00 = I0000oI00((IIOoOiOI) it.next());
/* 44 */                    if (objI0000oI00 != null) {
/* 46 */                        arrayList.add(objI0000oI00);
                            }
                        }
                    } else {
/* 50 */                Object objI0000oI002 = I0000oI00(iIOoOiOII00oII);
/* 54 */                if (objI0000oI002 != null) {
/* 56 */                    arrayList.add(objI0000oI002);
                        }
                    }
/* 113 */           return arrayList;
                }

                public String I000OOo1O() {
/* 7 */             return I00Io1lO().I010101Oo1lO(IIi0I0I0o.I0IilI00l);
                }

                public void I000OiO(IIOoOiOI iIOoOiOI, Object obj) {
/* 1 */             if (iIOoOiOI == null || obj == null) {
/* 551 */               return;
                    }
/* 7 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 11 */            IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I01ll0oooOoO;
/* 13 */            IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoOI00Io1lO.I00oII(iIi0I0I0o);
/* 17 */            if (iIOoOiOII00oII == null) {
/* 551 */               return;
                    }
/* 31 */            IIOoOiOI iIOoOiOII00Io1lO = obj instanceof IIi0O1OOO1i0 ? ((IIi0O1OOO1i0) obj).I00Io1lO() : null;
/* 34 */            if (!(iIOoOiOII00oII instanceof IIOoIilO)) {
/* 85 */                boolean zEquals = iIOoOiOII00oII.equals(iIOoOiOII00Io1lO);
/* 89 */                if (!zEquals && (iIOoOiOII00oII instanceof IIi0O10I)) {
/* 99 */                    zEquals = ((IIi0O10I) iIOoOiOII00oII).I00iOIl.equals(iIOoOiOII00Io1lO);
                        }
/* 103 */               if (zEquals) {
/* 107 */                   IIOoIilO iIOoIilO = new IIOoIilO();
/* 110 */                   iIOoIilO.I00ioIO(iIOoOiOI);
/* 113 */                   iIOoIilO.I00ioIO(iIOoOiOII00Io1lO);
/* 120 */                   I00Io1lO().I010iIIOlo(iIi0I0I0o, iIOoIilO);
/* 551 */                   return;
                        }
/* 551 */               return;
                    }
/* 36 */            IIOoIilO iIOoIilO2 = (IIOoIilO) iIOoOiOII00oII;
/* 38 */            ArrayList arrayList = iIOoIilO2.I00iOIl;
/* 40 */            int i = 0;
                    while (true) {
/* 45 */                if (i >= arrayList.size()) {
/* 80 */                    i = -1;
                            break;
                        }
/* 47 */                IIOoOiOI iIOoOiOII00l0I0l0lO1 = iIOoIilO2.I00l0I0l0lO1(i);
/* 51 */                if (iIOoOiOII00l0I0l0lO1 == null) {
/* 53 */                    if (iIOoOiOII00l0I0l0lO1 == iIOoOiOII00Io1lO) {
                                break;
                            } else {
/* 77 */                        i++;
                            }
                        } else if (iIOoOiOII00l0I0l0lO1.equals(iIOoOiOII00Io1lO) || ((iIOoOiOII00l0I0l0lO1 instanceof IIi0O10I) && ((IIi0O10I) iIOoOiOII00l0I0l0lO1).I00iOIl.equals(iIOoOiOII00Io1lO))) {
                            break;
                        } else {
/* 77 */                    i++;
                        }
                    }
/* 81 */            arrayList.add(i, iIOoOiOI);
                }

                public void I000iOII(OIlolo oIlolo, Object obj) {
/* 1 */             I000l1(oIlolo, obj);
                }

                public void I000l1(IIi0O1OOO1i0 iIi0O1OOO1i0, Object obj) {
/* 1 */             if (iIi0O1OOO1i0 == null) {
/* 3 */                 return;
                    }
/* 8 */             I000OiO(iIi0O1OOO1i0.I00Io1lO(), obj);
                }

                public boolean I000lI(IIOoOiOI iIOoOiOI) {
/* 2 */             if (iIOoOiOI != null) {
/* 6 */                 IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 10 */                IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I01ll0oooOoO;
/* 12 */                IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoOI00Io1lO.I00oII(iIi0I0I0o);
/* 16 */                if (iIOoOiOII00oII != null) {
/* 22 */                    if (iIOoOiOII00oII instanceof IIOoIilO) {
/* 24 */                        IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOII00oII;
/* 26 */                        ArrayList arrayList = iIOoIilO.I00iOIl;
/* 28 */                        boolean zRemove = arrayList.remove(iIOoOiOI);
/* 32 */                        if (!zRemove) {
/* 34 */                            int i = 0;
                                    while (true) {
/* 39 */                                if (i >= arrayList.size()) {
                                            break;
                                        }
/* 41 */                                IIOoOiOI iIOoOiOII00l0I0l0lO1 = iIOoIilO.I00l0I0l0lO1(i);
/* 47 */                                if ((iIOoOiOII00l0I0l0lO1 instanceof IIi0O10I) && ((IIi0O10I) iIOoOiOII00l0I0l0lO1).I00iOIl.equals(iIOoOiOI)) {
/* 60 */                                    zRemove = arrayList.remove(iIOoOiOII00l0I0l0lO1);
                                            break;
                                        }
/* 65 */                                i++;
                                    }
                                }
/* 72 */                        if (arrayList.size() == 1) {
/* 84 */                            I00Io1lO().I010iIIOlo(IIi0I0I0o.I01ll0oooOoO, iIOoIilO.I00lll10(0));
                                }
/* 87 */                        return zRemove;
                            }
/* 88 */                    boolean zEquals = iIOoOiOII00oII.equals(iIOoOiOI);
/* 92 */                    if (!zEquals && (iIOoOiOII00oII instanceof IIi0O10I)) {
/* 102 */                       zEquals = ((IIi0O10I) iIOoOiOII00oII).I00iOIl.equals(iIOoOiOI);
                            }
/* 106 */                   if (zEquals) {
/* 112 */                       I00Io1lO().I010II(iIi0I0I0o);
/* 21 */                        return true;
                            }
                        }
                    }
/* 1 */             return false;
                }

                public boolean I000o00OoI0I(OIlolo oIlolo) {
/* 1 */             boolean zI000oI1ioi = I000oI1ioi(oIlolo);
/* 5 */             if (zI000oI1ioi) {
/* 8 */                 oIlolo.I00OloOo(null);
                    }
/* 49 */            return zI000oI1ioi;
                }

                public boolean I000oI1ioi(IIi0O1OOO1i0 iIi0O1OOO1i0) {
/* 1 */             if (iIi0O1OOO1i0 == null) {
/* 3 */                 return false;
                    }
/* 9 */             return I000lI(iIi0O1OOO1i0.I00Io1lO());
                }

                public void I00100l0(List<Object> list) {
                    IIOoIilO iIOoIilO;
/* 1 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 5 */             IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I01ll0oooOoO;
/* 7 */             if (list == null) {
/* 140 */               iIOoIilO = null;
                    } else if (list instanceof IIOoOOOol) {
/* 15 */                iIOoIilO = ((IIOoOOOol) list).I00iOIl;
                    } else {
/* 21 */                IIOoIilO iIOoIilO2 = new IIOoIilO();
/* 32 */                for (Object obj : list) {
/* 40 */                    if (obj instanceof String) {
/* 49 */                        iIOoIilO2.I00ioIO(new IIi0l1((String) obj));
                            } else if ((obj instanceof Integer) || (obj instanceof Long)) {
/* 134 */                       iIOoIilO2.I00ioIO(IIOool.I00o0iI0io1(((Number) obj).longValue()));
                            } else if ((obj instanceof Float) || (obj instanceof Double)) {
/* 120 */                       iIOoIilO2.I00ioIO(new IIOolo0l(((Number) obj).floatValue()));
                            } else if (obj instanceof IIi0O1OOO1i0) {
/* 81 */                        iIOoIilO2.I00ioIO(((IIi0O1OOO1i0) obj).I00Io1lO());
                            } else {
/* 85 */                        if (obj != null) {
/* 105 */                           IoOOl0iOl1io.I000o00OoI0I(obj.getClass().getName(), "Error: Don't know how to convert type to COSBase '", "'");
/* 108 */                           return;
                                }
/* 89 */                        iIOoIilO2.I00ioIO(IIi0II0l0o.I00iOIl);
                            }
                        }
/* 138 */               iIOoIilO = iIOoIilO2;
                    }
/* 141 */           iIOoi0ooOoOI00Io1lO.I010iIIOlo(iIi0I0I0o, iIOoIilO);
                }

/* 16 */        public OIlololiOOOI(IIOoi0ooOoO iIOoi0ooOoO) {
/* 18 */            this.I00iOIl = iIOoi0ooOoO;
                }
            }
