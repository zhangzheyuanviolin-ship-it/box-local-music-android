            package p000;

            import java.util.ArrayList;
            
/* 3 */     public abstract class OIlol0 extends OIlOiIo {
                protected static final float I00iiO = -1.0f;

                public OIlol0() {
                }

                public String[] I000lI(String str) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 11 */            if (!(iIOoOiOII00oo1iO0ll instanceof IIOoIilO)) {
/* 44 */                return null;
                    }
/* 13 */            IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOII00oo1iO0ll;
/* 15 */            ArrayList arrayList = iIOoIilO.I00iOIl;
/* 21 */            String[] strArr = new String[arrayList.size()];
/* 28 */            for (int i = 0; i < arrayList.size(); i++) {
/* 38 */                strArr[i] = ((IIi0I0I0o) iIOoIilO.I00lll10(i)).I00iOIl;
                    }
/* 43 */            return strArr;
                }

                public OIlli00oo I000o00OoI0I(String str) {
/* 9 */             IIOoIilO iIOoIilO = (IIOoIilO) I00Io1lO().I00oo1iO0ll(str);
/* 11 */            if (iIOoIilO != null) {
/* 15 */                return new OIlli00oo(iIOoIilO);
                    }
/* 19 */            return null;
                }

                public Object I000oI1ioi(String str) {
/* 9 */             IIOoIilO iIOoIilO = (IIOoIilO) I00Io1lO().I00oo1iO0ll(str);
/* 11 */            if (iIOoIilO == null) {
/* 42 */                return null;
                    }
/* 14 */            ArrayList arrayList = iIOoIilO.I00iOIl;
/* 21 */            if (arrayList.size() == 3) {
/* 25 */                return new OIlli00oo(iIOoIilO);
                    }
/* 34 */            if (arrayList.size() == 4) {
/* 38 */                return new OIllOiiIio(iIOoIilO);
                    }
/* 42 */            return null;
                }

                public int I00100l0(String str, int i) {
/* 1 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 5 */             iIOoi0ooOoOI00Io1lO.getClass();
/* 13 */            return iIOoi0ooOoOI00Io1lO.I00oooO(IIi0I0I0o.I00ioIO(str), null, i);
                }

                public String I00100o1O0lo(String str) {
/* 1 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 5 */             iIOoi0ooOoOI00Io1lO.getClass();
/* 12 */            return iIOoi0ooOoOI00Io1lO.I010101Oo1lO(IIi0I0I0o.I00ioIO(str));
                }

                public String I0010I0i(String str, String str2) {
/* 1 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 5 */             iIOoi0ooOoOI00Io1lO.getClass();
/* 12 */            String strI010101Oo1lO = iIOoi0ooOoOI00Io1lO.I010101Oo1lO(IIi0I0I0o.I00ioIO(str));
                    return strI010101Oo1lO == null ? str2 : strI010101Oo1lO;
                }

                public Object I0010o(String str, String str2) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 11 */            if (!(iIOoOiOII00oo1iO0ll instanceof IIOoIilO)) {
                        return iIOoOiOII00oo1iO0ll instanceof IIi0I0I0o ? ((IIi0I0I0o) iIOoOiOII00oo1iO0ll).I00iOIl : str2;
                    }
/* 13 */            IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOII00oo1iO0ll;
/* 15 */            ArrayList arrayList = iIOoIilO.I00iOIl;
/* 21 */            String[] strArr = new String[arrayList.size()];
/* 28 */            for (int i = 0; i < arrayList.size(); i++) {
/* 30 */                IIOoOiOI iIOoOiOII00lll10 = iIOoIilO.I00lll10(i);
/* 36 */                if (iIOoOiOII00lll10 instanceof IIi0I0I0o) {
/* 42 */                    strArr[i] = ((IIi0I0I0o) iIOoOiOII00lll10).I00iOIl;
                        }
                    }
/* 47 */            return strArr;
                }

                public float I00111O(String str) {
/* 1 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 5 */             iIOoi0ooOoOI00Io1lO.getClass();
/* 14 */            return iIOoi0ooOoOI00Io1lO.I00ooiO1I(IIi0I0I0o.I00ioIO(str), I00iiO);
                }

                public float I001IIilI0O(String str, float f) {
/* 1 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 5 */             iIOoi0ooOoOI00Io1lO.getClass();
/* 12 */            return iIOoi0ooOoOI00Io1lO.I00ooiO1I(IIi0I0I0o.I00ioIO(str), f);
                }

                public Object I001IO000(String str, float f) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 11 */            if (!(iIOoOiOII00oo1iO0ll instanceof IIOoIilO)) {
/* 52 */                if (iIOoOiOII00oo1iO0ll instanceof IIi0IoOo) {
/* 60 */                    return Float.valueOf(((IIi0IoOo) iIOoOiOII00oo1iO0ll).I00ioIO());
                        }
/* 69 */                if (f == I00iiO) {
/* 71 */                    return null;
                        }
/* 73 */                return Float.valueOf(f);
                    }
/* 13 */            IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOII00oo1iO0ll;
/* 15 */            ArrayList arrayList = iIOoIilO.I00iOIl;
/* 21 */            float[] fArr = new float[arrayList.size()];
/* 28 */            for (int i = 0; i < arrayList.size(); i++) {
/* 30 */                IIOoOiOI iIOoOiOII00lll10 = iIOoIilO.I00lll10(i);
/* 36 */                if (iIOoOiOII00lll10 instanceof IIi0IoOo) {
/* 44 */                    fArr[i] = ((IIi0IoOo) iIOoOiOII00lll10).I00ioIO();
                        }
                    }
/* 49 */            return fArr;
                }

                public Object I001i1O0Ol(String str, String str2) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
                    return iIOoOiOII00oo1iO0ll instanceof IIi0IoOo ? Float.valueOf(((IIi0IoOo) iIOoOiOII00oo1iO0ll).I00ioIO()) : iIOoOiOII00oo1iO0ll instanceof IIi0I0I0o ? ((IIi0I0I0o) iIOoOiOII00oo1iO0ll).I00iOIl : str2;
                }

                public String I001i1lo1io(String str) {
/* 1 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 5 */             iIOoi0ooOoOI00Io1lO.getClass();
/* 12 */            return iIOoi0ooOoOI00Io1lO.I010I0(IIi0I0I0o.I00ioIO(str));
                }

                public boolean I001iOo1i0O(String str) {
                    return I00Io1lO().I00oo1iO0ll(str) != null;
                }

                public void I001l0I00(String str, String[] strArr) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 11 */            IIOoIilO iIOoIilO = new IIOoIilO();
/* 16 */            for (String str2 : strArr) {
/* 24 */                iIOoIilO.I00ioIO(IIi0I0I0o.I00ioIO(str2));
                    }
/* 30 */            IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 34 */            iIOoi0ooOoOI00Io1lO.getClass();
/* 41 */            iIOoi0ooOoOI00Io1lO.I010iIIOlo(IIi0I0I0o.I00ioIO(str), iIOoIilO);
/* 52 */            I000OiO(iIOoOiOII00oo1iO0ll, I00Io1lO().I00oo1iO0ll(str));
                }

                public void I001lIiIIo1O(String str, float[] fArr) {
/* 3 */             IIOoIilO iIOoIilO = new IIOoIilO();
/* 8 */             for (float f : fArr) {
/* 17 */                iIOoIilO.I00ioIO(new IIOolo0l(f));
                    }
/* 27 */            IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 31 */            IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 35 */            iIOoi0ooOoOI00Io1lO.getClass();
/* 42 */            iIOoi0ooOoOI00Io1lO.I010iIIOlo(IIi0I0I0o.I00ioIO(str), iIOoIilO);
/* 53 */            I000OiO(iIOoOiOII00oo1iO0ll, I00Io1lO().I00oo1iO0ll(str));
                }

                public void I001lllioOl(String str, String[] strArr) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 11 */            IIOoIilO iIOoIilO = new IIOoIilO();
/* 16 */            for (String str2 : strArr) {
/* 25 */                iIOoIilO.I00ioIO(new IIi0l1(str2));
                    }
/* 31 */            IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 35 */            iIOoi0ooOoOI00Io1lO.getClass();
/* 42 */            iIOoi0ooOoOI00Io1lO.I010iIIOlo(IIi0I0I0o.I00ioIO(str), iIOoIilO);
/* 53 */            I000OiO(iIOoOiOII00oo1iO0ll, I00Io1lO().I00oo1iO0ll(str));
                }

                public void I001lloI(String str, OIlli00oo oIlli00oo) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 9 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 13 */            iIOoi0ooOoOI00Io1lO.getClass();
/* 20 */            iIOoi0ooOoOI00Io1lO.I010ioo(IIi0I0I0o.I00ioIO(str), oIlli00oo);
/* 29 */            I000OiO(iIOoOiOII00oo1iO0ll, oIlli00oo == null ? null : oIlli00oo.I00iOIl);
                }

                public void I00II0Ol1O0l(String str, OIllOiiIio oIllOiiIio) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 9 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 13 */            iIOoi0ooOoOI00Io1lO.getClass();
/* 20 */            iIOoi0ooOoOI00Io1lO.I010ioo(IIi0I0I0o.I00ioIO(str), oIllOiiIio);
/* 31 */            I000OiO(iIOoOiOII00oo1iO0ll, oIllOiiIio == null ? null : oIllOiiIio.I00Io1lO());
                }

                public void I00II0oii1o(String str, int i) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 9 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 13 */            iIOoi0ooOoOI00Io1lO.getClass();
/* 20 */            iIOoi0ooOoOI00Io1lO.I010i10l(IIi0I0I0o.I00ioIO(str), i);
/* 31 */            I000OiO(iIOoOiOII00oo1iO0ll, I00Io1lO().I00oo1iO0ll(str));
                }

                public void I00IO1(String str, String str2) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 9 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 13 */            iIOoi0ooOoOI00Io1lO.getClass();
/* 20 */            iIOoi0ooOoOI00Io1lO.I010l10O(IIi0I0I0o.I00ioIO(str), str2);
/* 31 */            I000OiO(iIOoOiOII00oo1iO0ll, I00Io1lO().I00oo1iO0ll(str));
                }

                public void I00IO1oi11O(String str, float f) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 9 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 13 */            iIOoi0ooOoOI00Io1lO.getClass();
/* 20 */            iIOoi0ooOoOI00Io1lO.I010OIo1l(IIi0I0I0o.I00ioIO(str), f);
/* 31 */            I000OiO(iIOoOiOII00oo1iO0ll, I00Io1lO().I00oo1iO0ll(str));
                }

                public void I00IOO(String str, int i) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 9 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 13 */            iIOoi0ooOoOI00Io1lO.getClass();
/* 20 */            iIOoi0ooOoOI00Io1lO.I010i10l(IIi0I0I0o.I00ioIO(str), i);
/* 31 */            I000OiO(iIOoOiOII00oo1iO0ll, I00Io1lO().I00oo1iO0ll(str));
                }

                public void I00IioO0OiOi(String str, String str2) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
/* 9 */             IIOoi0ooOoO iIOoi0ooOoOI00Io1lO = I00Io1lO();
/* 13 */            iIOoi0ooOoOI00Io1lO.getClass();
/* 20 */            iIOoi0ooOoOI00Io1lO.I010l1O(IIi0I0I0o.I00ioIO(str), str2);
/* 31 */            I000OiO(iIOoOiOII00oo1iO0ll, I00Io1lO().I00oo1iO0ll(str));
                }

/* 4 */         public OIlol0(IIOoi0ooOoO iIOoi0ooOoO) {
/* 5 */             super(iIOoi0ooOoO);
                }
            }
