            package p000;

            import android.util.Log;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Map;
            
            public abstract class OIloiiI1i1 extends OIll100 {
                public Il0IIl0OOI I00l0OO0IO;
                public Io0O0o0l1o I00li1OI;
                public Boolean I00ll1;
                public HashSet I00lli11;

                public OIloiiI1i1(IIOoi0ooOoO iIOoi0ooOoO) {
/* 1 */             super(iIOoi0ooOoO);
/* 9 */             this.I00lli11 = new HashSet();
                }

                @Override
                public final float I000OOo1O(int i) {
/* 1 */             IliiI1 iliiI1 = this.I00iiO;
/* 4 */             if (iliiI1 == null) {
/* 60 */                I000II.I001IO000("No AFM");
/* 3 */                 return 0.0f;
                    }
/* 8 */             String strI0000Il00O = this.I00l0OO0IO.I0000Il00O(i);
/* 18 */            if (".notdef".equals(strI0000Il00O)) {
/* 20 */                return 250.0f;
                    }
/* 29 */            if ("nbspace".equals(strI0000Il00O)) {
/* 31 */                strI0000Il00O = "space";
                    } else if ("sfthyphen".equals(strI0000Il00O)) {
/* 42 */                strI0000Il00O = "hyphen";
                    }
/* 50 */            IO11iO0l iO11iO0l = (IO11iO0l) iliiI1.I000lI.get(strI0000Il00O);
/* 52 */            if (iO11iO0l != null) {
/* 54 */                return iO11iO0l.I00000oOI;
                    }
/* 3 */             return 0.0f;
                }

                @Override
                public boolean I000l1() {
/* 1 */             Il0IIl0OOI il0IIl0OOI = this.I00l0OO0IO;
/* 5 */             if (il0IIl0OOI instanceof Iii100lOoooi) {
/* 7 */                 Iii100lOoooi iii100lOoooi = (Iii100lOoooi) il0IIl0OOI;
/* 9 */                 HashMap map = iii100lOoooi.I00ilI0I1;
/* 15 */                if (map.size() > 0) {
/* 17 */                    Il0IIl0OOI il0IIl0OOI2 = iii100lOoooi.I00iio;
/* 31 */                    for (Map.Entry entry : map.entrySet()) {
/* 63 */                        if (!((String) entry.getValue()).equals(il0IIl0OOI2.I0000Il00O(((Integer) entry.getKey()).intValue()))) {
/* 72 */                            return false;
                                }
                            }
                        }
                    }
/* 70 */            if (I0000Il00O()) {
/* 72 */                return false;
                    }
/* 80 */            return OlIl10I01i.I00000oIO.containsKey(getName());
                }

                @Override
                public final boolean I000lI() {
/* 1 */             return false;
                }

                @Override
                public final String I00100l0(int i) {
/* 3 */             return I00100o1O0lo(i, Io0O0o0l1o.I0000O);
                }

                @Override
                public final String I00100o1O0lo(int i, Io0O0o0l1o io0O0o0l1o) throws NumberFormatException {
                    String strI0000Il00O;
/* 1 */             HashSet hashSet = this.I00lli11;
/* 3 */             Io0O0o0l1o io0O0o0l1o2 = this.I00li1OI;
/* 7 */             if (io0O0o0l1o2 != Io0O0o0l1o.I0000O) {
/* 10 */                io0O0o0l1o = io0O0o0l1o2;
                    }
/* 11 */            String strI00100l0 = super.I00100l0(i);
/* 15 */            if (strI00100l0 != null) {
/* 17 */                return strI00100l0;
                    }
/* 18 */            Il0IIl0OOI il0IIl0OOI = this.I00l0OO0IO;
/* 21 */            if (il0IIl0OOI != null) {
/* 23 */                strI0000Il00O = il0IIl0OOI.I0000Il00O(i);
/* 27 */                String strI0000Il00O2 = io0O0o0l1o.I0000Il00O(strI0000Il00O);
/* 31 */                if (strI0000Il00O2 != null) {
/* 33 */                    return strI0000Il00O2;
                        }
                    } else {
/* 34 */                strI0000Il00O = null;
                    }
/* 43 */            if (!hashSet.contains(Integer.valueOf(i))) {
/* 49 */                hashSet.add(Integer.valueOf(i));
/* 54 */                if (strI0000Il00O != null) {
/* 62 */                    StringBuilder sbI00111O = IIlIOloOOO.I00111O(i, "No Unicode mapping for ", strI0000Il00O, " (", ") in font ");
/* 70 */                    sbI00111O.append(getName());
/* 77 */                    Log.w("PdfBox-Android", sbI00111O.toString());
/* 20 */                    return null;
                        }
/* 85 */                StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("No Unicode mapping for character code ", i, " in font ");
/* 93 */                sbI00100o1O0lo.append(getName());
/* 100 */               Log.w("PdfBox-Android", sbI00100o1O0lo.toString());
                    }
/* 20 */            return null;
                }

                public final Boolean I0010I0i() {
/* 1 */             OIll1lio oIll1lio = this.I00iio;
/* 3 */             if (oIll1lio != null) {
/* 10 */                return Boolean.valueOf(oIll1lio.I0000oI00(4));
                    }
/* 15 */            return null;
                }

                public void I0010o() {
/* 5 */             IIOoOiOI iIOoOiOII00oII = this.I00iOIl.I00oII(IIi0I0I0o.I01O10iIoo1O);
/* 11 */            if (iIOoOiOII00oII instanceof IIi0I0I0o) {
/* 13 */                IIi0I0I0o iIi0I0I0o = (IIi0I0I0o) iIOoOiOII00oII;
/* 15 */                Il0IIl0OOI il0IIl0OOII00000oOI = Il0IIl0OOI.I00000oOI(iIi0I0I0o);
/* 19 */                this.I00l0OO0IO = il0IIl0OOII00000oOI;
/* 21 */                if (il0IIl0OOII00000oOI == null) {
/* 41 */                    Log.w("PdfBox-Android", "Unknown encoding: " + iIi0I0I0o.I00iOIl);
/* 48 */                    this.I00l0OO0IO = I00111O();
                        }
                    } else if (iIOoOiOII00oII instanceof IIOoi0ooOoO) {
/* 56 */                IIOoi0ooOoO iIOoi0ooOoO = (IIOoi0ooOoO) iIOoOiOII00oII;
/* 58 */                Boolean boolI0010I0i = I0010I0i();
/* 62 */                IIi0I0I0o iIi0I0I0o2 = IIi0I0I0o.I00oOio10iI1;
/* 64 */                IIi0I0I0o iIi0I0I0oI00o0iI0io1 = iIOoi0ooOoO.I00o0iI0io1(iIi0I0I0o2);
/* 91 */                Il0IIl0OOI il0IIl0OOII00111O = ((iIi0I0I0oI00o0iI0io1 == null || Il0IIl0OOI.I00000oOI(iIi0I0I0oI00o0iI0io1) == null) && Boolean.TRUE.equals(boolI0010I0i)) ? I00111O() : null;
/* 92 */                if (boolI0010I0i == null) {
/* 94 */                    boolI0010I0i = Boolean.FALSE;
                        }
/* 98 */                boolean zBooleanValue = boolI0010I0i.booleanValue();
/* 102 */               Iii100lOoooi iii100lOoooi = new Iii100lOoooi();
/* 110 */               iii100lOoooi.I00ilI0I1 = new HashMap();
/* 112 */               iii100lOoooi.I00iiO = iIOoi0ooOoO;
/* 126 */               Il0IIl0OOI il0IIl0OOII00000oOI2 = iIOoi0ooOoO.I00iOIl.containsKey(iIi0I0I0o2) ? Il0IIl0OOI.I00000oOI(iIOoi0ooOoO.I00o0iI0io1(iIi0I0I0o2)) : null;
/* 130 */               if (il0IIl0OOII00000oOI2 != null) {
/* 146 */                   il0IIl0OOII00111O = il0IIl0OOII00000oOI2;
                        } else if (!zBooleanValue) {
/* 134 */                   il0IIl0OOII00111O = OlIlI0.I00iio;
                        } else if (il0IIl0OOII00111O == null) {
/* 142 */                   I000II.I000iOII("Symbolic fonts must have a built-in encoding");
/* 145 */                   return;
                        }
/* 147 */               iii100lOoooi.I00iio = il0IIl0OOII00111O;
/* 153 */               iii100lOoooi.I00iOIl.putAll(il0IIl0OOII00111O.I00iOIl);
/* 160 */               iii100lOoooi.I00iiI.putAll(il0IIl0OOII00111O.I00iiI);
/* 163 */               iii100lOoooi.I0000O();
/* 166 */               this.I00l0OO0IO = iii100lOoooi;
                    } else {
/* 173 */               this.I00l0OO0IO = I00111O();
                    }
/* 193 */           if ("ZapfDingbats".equals((String) OlIl10I01i.I00000oIO.get(getName()))) {
/* 197 */               this.I00li1OI = Io0O0o0l1o.I0000oI00;
                    } else {
/* 202 */               this.I00li1OI = Io0O0o0l1o.I0000O;
                    }
                }

                public abstract Il0IIl0OOI I00111O();
            }
