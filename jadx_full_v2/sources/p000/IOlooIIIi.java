            package p000;
            
/* 112 */   public class IOlooIIIi {
                public final IOOl0ll I00000oIO;
                public final IOOl0ll I00000oOI;
                public final IOOl0ll I0000Il00O;
                public final float[] I0000O;

                /* JADX WARN: Illegal instructions before constructor call */
                public IOlooIIIi(IOOl0ll iOOl0ll, IOOl0ll iOOl0ll2, int i) {
/* 19 */            IOOl0ll iOOl0llI00000oIO = iiO1i0O.I00000oIO(iOOl0ll.I00000oOI, 12884901888L) ? iiOiII0.I00000oIO(iOOl0ll) : iOOl0ll;
/* 33 */            IOOl0ll iOOl0llI00000oIO2 = iiO1i0O.I00000oIO(iOOl0ll2.I00000oOI, 12884901888L) ? iiOiII0.I00000oIO(iOOl0ll2) : iOOl0ll2;
/* 35 */            float[] fArr = null;
/* 36 */            if (i == 3) {
/* 40 */                boolean zI00000oIO = iiO1i0O.I00000oIO(iOOl0ll.I00000oOI, 12884901888L);
/* 46 */                boolean zI00000oIO2 = iiO1i0O.I00000oIO(iOOl0ll2.I00000oOI, 12884901888L);
/* 50 */                if ((!zI00000oIO || !zI00000oIO2) && (zI00000oIO || zI00000oIO2)) {
/* 65 */                    i001lolI1I i001loli1i = ((Oi1IOl) (zI00000oIO ? iOOl0ll : iOOl0ll2)).I0000O;
/* 67 */                    float[] fArrI00000oIO = iIo1Iiloo.I0000oI00;
/* 76 */                    float[] fArrI00000oIO2 = zI00000oIO ? i001loli1i.I00000oIO() : fArrI00000oIO;
/* 79 */                    fArrI00000oIO = zI00000oIO2 ? i001loli1i.I00000oIO() : fArrI00000oIO;
/* 101 */                   fArr = new float[]{fArrI00000oIO2[0] / fArrI00000oIO[0], fArrI00000oIO2[1] / fArrI00000oIO[1], fArrI00000oIO2[2] / fArrI00000oIO[2]};
                        }
                    }
/* 110 */           this(iOOl0ll2, iOOl0llI00000oIO, iOOl0llI00000oIO2, fArr);
                }

                public long I00000oIO(long j) {
/* 1 */             float fI000O01llI0 = IOOiio0i.I000O01llI0(j);
/* 5 */             float fI000II = IOOiio0i.I000II(j);
/* 9 */             float fI0000oI00 = IOOiio0i.I0000oI00(j);
/* 13 */            float fI0000O = IOOiio0i.I0000O(j);
/* 17 */            IOOl0ll iOOl0ll = this.I00000oOI;
/* 19 */            long jI0000O = iOOl0ll.I0000O(fI000O01llI0, fI000II, fI0000oI00);
/* 28 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI0000O >> 32));
/* 39 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI0000O & 4294967295L));
/* 43 */            float fI0000oI002 = iOOl0ll.I0000oI00(fI000O01llI0, fI000II, fI0000oI00);
/* 47 */            float[] fArr = this.I0000O;
/* 49 */            if (fArr != null) {
/* 54 */                fIntBitsToFloat *= fArr[0];
/* 58 */                fIntBitsToFloat2 *= fArr[1];
/* 62 */                fI0000oI002 *= fArr[2];
                    }
/* 64 */            float f = fIntBitsToFloat;
/* 65 */            float f2 = fIntBitsToFloat2;
/* 70 */            return this.I0000Il00O.I0001Ioi1lo(f, f2, fI0000oI002, fI0000O, this.I00000oIO);
                }

/* 113 */       public IOlooIIIi(IOOl0ll iOOl0ll, IOOl0ll iOOl0ll2, IOOl0ll iOOl0ll3, float[] fArr) {
/* 115 */           this.I00000oIO = iOOl0ll;
/* 116 */           this.I00000oOI = iOOl0ll2;
/* 117 */           this.I0000Il00O = iOOl0ll3;
/* 118 */           this.I0000O = fArr;
                }
            }
