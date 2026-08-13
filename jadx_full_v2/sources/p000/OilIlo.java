            package p000;

            import android.content.Context;
            import java.util.ArrayList;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOilIlo;", "LOooioIIoi0O;", "<init>", "()V", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class OilIlo extends OooioIIoi0O {
                public final OlO0OIIl1 I00000oOI;
                public final OOli1O I0000Il00O;
                public OlIl0i I0000O;
                public OlIl0i I0000oI00;
                public final ArrayList I0001Ioi1lo;
                public final OI1I0OoOl I000II;

                public OilIlo() {
/* 22 */            OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(new OilIl00O1o(false, false, "", Il01100l.I00iOIl, "auto", true, true, true, false, null));
/* 26 */            this.I00000oOI = olO0OIIl1I00000oIO;
/* 32 */            this.I0000Il00O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
/* 39 */            this.I0001Ioi1lo = new ArrayList();
/* 46 */            this.I000II = new OI1I0OoOl();
                }

                public static short[] I000OOo1O(ArrayList arrayList) {
/* 5 */             short[] sArr = new short[arrayList.size()];
/* 7 */             int size = arrayList.size();
/* 12 */            for (int i = 0; i < size; i++) {
/* 24 */                sArr[i] = ((Number) arrayList.get(i)).shortValue();
                    }
/* 29 */            return sArr;
                }

                public final void I0000oI00() {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 29 */            olO0OIIl1.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl1.getValue(), false, false, "", Il01100l.I00iOIl, null, false, false, false, false, null, 499));
                }

                public final void I0001Ioi1lo(Context context, O1oIOiI11o0 o1oIOiI11o0) {
/* 1 */             Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 12 */            Oil1lO oil1lO = obj instanceof Oil1lO ? (Oil1lO) obj : null;
/* 13 */            if (oil1lO == null) {
/* 15 */                return;
                    }
/* 32 */            iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), IiiIil1lOIO.I00000oIO, null, new OilIl1i(this, o1oIOiI11o0, oil1lO, context, null), 2);
                }

                public final void I000II(O1oIOiI11o0 o1oIOiI11o0) {
/* 11 */            if (((OilIl00O1o) this.I00000oOI.getValue()).I00000oIO) {
/* 104 */               return;
                    }
/* 14 */            OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 40 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 41 */            olO0OIIl1.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl1.getValue(), true, false, "", null, null, false, false, false, false, null, 504));
                    synchronized (this.I0001Ioi1lo) {
/* 49 */                this.I0001Ioi1lo.clear();
                    }
/* 53 */            IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 57 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 73 */            this.I0000O = iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I1iOI0oo(this, iOoil1iiIilo, 18), 2);
/* 75 */            Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 84 */            Oil1lO oil1lO = obj instanceof Oil1lO ? (Oil1lO) obj : null;
/* 85 */            if (oil1lO != null) {
/* 102 */               this.I0000oI00 = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), IiiIil1lOIO.I00000oIO, null, new OilIll01(this, oil1lO, null), 2);
                    }
                }

                public final void I000O01llI0(O1oIOiI11o0 o1oIOiI11o0) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 11 */            if (((OilIl00O1o) olO0OIIl1.getValue()).I00000oIO) {
/* 38 */                olO0OIIl1.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl1.getValue(), false, true, null, null, null, false, false, false, false, null, 1020));
/* 53 */                iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), IiiIil1lOIO.I00000oIO, null, new I0iOlI010ii(this, o1oIOiI11o0, null), 2);
                    }
                }
            }
