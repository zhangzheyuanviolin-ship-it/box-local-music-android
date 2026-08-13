            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class O011OoiO1 {
                public static final O011Ol I0000O = new O011Ol(new O01IIOOIO(false, false, false, true, "    ", "type", true, IOIOiIloIi0.I00iiO, true), OiliiIii.I00000oIO);
                public final O01IIOOIO I00000oIO;
                public final i1i0olI I00000oOI;
                public final O1OIll00i I0000Il00O;

                public O011OoiO1(O01IIOOIO o01iiooio, i1i0olI i1i0oli) {
/* 4 */             this.I00000oIO = o01iiooio;
/* 6 */             this.I00000oOI = i1i0oli;
/* 12 */            O1OIll00i o1OIll00i = new O1OIll00i(10);
/* 22 */            o1OIll00i.I00iiI = new ConcurrentHashMap(16);
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            this.I0000Il00O = o1OIll00i;
                }

                public final Object I00000oIO(O0O01001OOII o0o01001ooii, O01O0o1iI o01O0o1iI) {
                    Ii1iO1O o01liO;
/* 3 */             String str = null;
/* 4 */             if (o01O0o1iI instanceof O01ioO1o0i11) {
/* 12 */                o01liO = new O01o0Oi1iO(this, (O01ioO1o0i11) o01O0o1iI, str, 12);
                    } else if (o01O0o1iI instanceof O011oi0l1O) {
/* 24 */                o01liO = new O01o0OlOo1o(this, (O011oi0l1O) o01O0o1iI);
                    } else {
/* 30 */                if (!(o01O0o1iI instanceof O01i0Iiil) && !o01O0o1iI.equals(O01iI0i0.INSTANCE)) {
/* 41 */                    I000II.I00000oIO();
/* 3 */                     return null;
                        }
/* 49 */                o01liO = new O01liO(this, (O01lO1iO) o01O0o1iI, null);
                    }
/* 52 */            return o01liO.I0001Ioi1lo(o0o01001ooii);
                }

                public final Object I00000oOI(O0O01001OOII o0o01001ooii, String str) {
/* 1 */             I11l01l i11l01lI00000oIO = lOOoOlo1ili.I00000oIO(this, str);
/* 18 */            Object objI0001Ioi1lo = new OlOio1ilOli1(this, i01lIlOi.I00iiO, i11l01lI00000oIO, o0o01001ooii.I0000O(), null).I0001Ioi1lo(o0o01001ooii);
/* 28 */            if (i11l01lI00000oIO.I000o00OoI0I() == 10) {
/* 30 */                return objI0001Ioi1lo;
                    }
/* 65 */            I11l01l.I001IO000(i11l01lI00000oIO, "Expected EOF after parsing, but had " + ((String) i11l01lI00000oIO.I000II).charAt(i11l01lI00000oIO.I00000oOI - 1) + " instead", 0, null, 6);
/* 89 */            throw null;
                }

                public final O01O0o1iI I0000Il00O(O0O01001OOII o0o01001ooii, Object obj) {
/* 3 */             OOo0ooi oOo0ooi = new OOo0ooi();
/* 11 */            I0lOo1lO i0lOo1lO = new I0lOo1lO(6);
/* 14 */            i0lOo1lO.I00iiI = oOo0ooi;
/* 16 */            VarHandle.storeStoreFence();
/* 23 */            new O01lii(this, i0lOo1lO, 1).I0000O(o0o01001ooii, obj);
/* 26 */            Object obj2 = oOo0ooi.I00iOIl;
/* 28 */            if (obj2 != null) {
/* 30 */                return (O01O0o1iI) obj2;
                    }
/* 35 */            O0000Ioio00.I000OOo1O("result");
/* 89 */            throw null;
                }

                public final String I0000O(O0O01001OOII o0o01001ooii, Object obj) {
                    char[] cArr;
/* 5 */             O1I1OO o1i1oo = new O1I1OO(6, (byte) 0);
/* 8 */             IO110lIo iO110lIo = IO110lIo.I0000Il00O;
                    synchronized (iO110lIo) {
/* 11 */                I1Il0loi i1Il0loi = iO110lIo.I00000oIO;
/* 17 */                cArr = null;
/* 26 */                char[] cArr2 = (char[]) (i1Il0loi.isEmpty() ? null : i1Il0loi.removeLast());
/* 28 */                if (cArr2 != null) {
                            iO110lIo.I00000oOI -= cArr2.length;
/* 36 */                    cArr = cArr2;
                        }
                    }
/* 41 */            if (cArr == null) {
/* 45 */                cArr = new char[Barcode.FORMAT_ITF];
                    }
/* 47 */            o1i1oo.I00iiO = cArr;
                    try {
/* 69 */                new OlOiol1(new IIOo1i(o1i1oo), this, i01lIlOi.I00iiO, new O01OOloli[i01lIlOi.I00ioIO.I00000oOI()]).I0000O(o0o01001ooii, obj);
/* 72 */                return o1i1oo.toString();
                    } finally {
/* 81 */                o1i1oo.I00100o1O0lo();
                    }
                }
            }
