            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            
            public final class I0o1iOo1i {
                public Context I00000oIO;
                public IiIooOOOI I00000oOI;
                public long I0000Il00O;
                public OIo1i1 I0000O;

                public final I0o1iIoolIi I00000oIO() {
/* 3 */             Context context = this.I00000oIO;
/* 5 */             IiIooOOOI iiIooOOOI = this.I00000oOI;
/* 7 */             long j = this.I0000Il00O;
/* 9 */             I0o1iIoolIi i0o1iIoolIi = new I0o1iIoolIi();
/* 12 */            i0o1iIoolIi.I00000oIO = iiIooOOOI;
/* 19 */            i0o1iIoolIi.I00000oOI = 9205357640488583168L;
/* 23 */            int iI000OOo1O = iiO01ll11o1l.I000OOo1O(j);
/* 27 */            IioO1oi1li iioO1oi1li = new IioO1oi1li();
/* 30 */            iioO1oi1li.I00000oIO = context;
/* 32 */            iioO1oi1li.I00000oOI = iI000OOo1O;
/* 36 */            iioO1oi1li.I0000Il00O = 0L;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            i0o1iIoolIi.I0000Il00O = iioO1oi1li;
/* 52 */            i0o1iIoolIi.I0000O = new OIooliIO0(OoiIlOl1iI.I00000oIO, IIIOlol.I00ilO0);
/* 55 */            i0o1iIoolIi.I0000oI00 = true;
/* 57 */            i0o1iIoolIi.I000II = 0L;
/* 61 */            i0o1iIoolIi.I000O01llI0 = -1L;
/* 66 */            I0o1Oi0IO1 i0o1Oi0IO1 = new I0o1Oi0IO1(0);
/* 69 */            i0o1Oi0IO1.I00000oOI = i0o1iIoolIi;
/* 71 */            VarHandle.storeStoreFence();
/* 74 */            OO1Oooio101 oO1Oooio101 = Oll10I.I00000oIO;
/* 79 */            Oll1OII0o oll1OII0o = new Oll1OII0o(null, null, i0o1Oi0IO1);
/* 84 */            OlOl100 olOl100 = new OlOl100();
/* 87 */            olOl100.I00o101lO = i0o1iIoolIi;
/* 89 */            olOl100.I00oI0i = iioO1oi1li;
/* 91 */            olOl100.I010l1O(oll1OII0o);
/* 94 */            VarHandle.storeStoreFence();
/* 97 */            i0o1iIoolIi.I000OOo1O = olOl100;
/* 99 */            VarHandle.storeStoreFence();
/* 110 */           return i0o1iIoolIi;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 70 */                return true;
                    }
/* 18 */            if (!I0o1iOo1i.class.equals(obj != null ? obj.getClass() : null)) {
/* 68 */                return false;
                    }
/* 21 */            I0o1iOo1i i0o1iOo1i = (I0o1iOo1i) obj;
/* 31 */            if (!O0000Ioio00.I0000O(this.I00000oIO, i0o1iOo1i.I00000oIO) || !O0000Ioio00.I0000O(this.I00000oOI, i0o1iOo1i.I00000oOI)) {
/* 68 */                return false;
                    }
/* 45 */            long j = this.I0000Il00O;
/* 47 */            long j2 = i0o1iOo1i.I0000Il00O;
/* 49 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(j, j2) && this.I0000O.equals(i0o1iOo1i.I0000O);
                }

                public final int hashCode() {
/* 17 */            int iHashCode = (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31;
/* 18 */            long j = this.I0000Il00O;
/* 20 */            int i = IOOiio0i.I000oI1ioi;
/* 32 */            return this.I0000O.hashCode() + IIlIOloOOO.I0000O(j, iHashCode, 31);
                }
            }
