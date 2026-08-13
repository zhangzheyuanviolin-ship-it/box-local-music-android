            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public abstract class OOIOil00IIo extends IOOi01 {
                public final OOIOiioi1IlI I00000oOI;

                public OOIOil00IIo(O0O01001OOII o0o01001ooii) {
/* 1 */             super(o0o01001ooii);
/* 6 */             OilOloI oilOloII0000O = o0o01001ooii.I0000O();
/* 10 */            OOIOiioi1IlI oOIOiioi1IlI = new OOIOiioi1IlI(oilOloII0000O);
/* 34 */            oOIOiioi1IlI.I00000oOI = oilOloII0000O.I00000oIO() + "Array";
/* 36 */            VarHandle.storeStoreFence();
/* 39 */            this.I00000oOI = oOIOiioi1IlI;
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             return I000OOo1O(ii1iO1O);
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             int iI000O01llI0 = I000O01llI0(obj);
/* 7 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(this.I00000oOI);
/* 11 */            I000oI1ioi(iOl1l0o0i1I0I00000oOI, obj, iI000O01llI0);
/* 14 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final Object I0000oI00() {
/* 9 */             return (OOIOOo) I000iOII(I000o00OoI0I());
                }

                @Override
                public final int I0001Ioi1lo(Object obj) {
/* 3 */             return ((OOIOOo) obj).I0000O();
                }

                @Override
                public final Iterator I000II(Object obj) {
/* 49 */            throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
                }

                @Override
                public final Object I000l1(Object obj) {
/* 3 */             return ((OOIOOo) obj).I00000oIO();
                }

                @Override
                public final void I000lI(int i, Object obj, Object obj2) {
/* 215 */           throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
                }

                public abstract Object I000o00OoI0I();

                public abstract void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i);
            }
