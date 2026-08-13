            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Il0ioilIio0I extends O0iO10011II implements Function1 {
                public final Il0l0i I00iOIl;
                public final OlO01l1oOil I00iiI;
                public final long I00iiO;
                public final long I00iio;
                public final OO1I0001000i I00ilI0I1;
                public final long I00ilO0;
                public final Il0iIi0iO I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Il0ioilIio0I(Il0l0i il0l0i, OoI11o1OI ooI11o1OI, long j, long j2, long j3, OO1I0001000i oO1I0001000i, long j4, Il0iIi0iO il0iIi0iO) {
/* 16 */            super(1);
/* 1 */             this.I00iOIl = il0l0i;
/* 3 */             this.I00iiI = ooI11o1OI;
/* 5 */             this.I00iiO = j2;
/* 7 */             this.I00iio = j3;
/* 9 */             this.I00ilI0I1 = oO1I0001000i;
/* 11 */            this.I00ilO0 = j4;
/* 13 */            this.I00io1l = il0iIi0iO;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 3 */             Il0l0i il0l0i = this.I00iOIl;
/* 5 */             Oiolo1I oiolo1I = il0l0i.I00oOio10iI1;
/* 9 */             OlO01l1oOil olO01l1oOil = this.I00iiI;
/* 22 */            long j = olO01l1oOil != null ? ((IooO0O) olO01l1oOil.getValue()).I00000oIO : 0L;
/* 23 */            oiolo1I.I0000O();
/* 30 */            if (oiolo1I.I0000O()) {
/* 34 */                oiolo1I.I0000Il00O.getClass();
                    }
/* 37 */            long jI0000oI00 = IooO0O.I0000oI00(j, 0L);
/* 45 */            if (oiolo1I.I0000O()) {
/* 47 */                oiolo1I.I000OiO = jI0000oI00;
                    }
/* 49 */            I0iolI1I11l1 i0iolI1I11l1 = il0l0i.I00oliIiO01i;
/* 63 */            long jI0000oI002 = IooO0O.I0000oI00(i0iolI1I11l1 != null ? i0iolI1I11l1.I00000oIO(this.I00iiO, this.I00iio, O0iOOoiioO.I00iOIl) : 0L, jI0000oI00);
/* 72 */            long j2 = this.I00ilO0;
/* 95 */            OO1I0001000i oO1I0001000i = this.I00ilI0I1;
/* 97 */            oO11o0IO.I000II(oO1I0001000i);
/* 109 */           oO1I0001000i.I00iIi0i1o(IooO0O.I0000oI00(((((int) (jI0000oI002 >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (jI0000oI002 & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L), oO1I0001000i.I00ilI0I1), 0.0f, this.I00io1l);
/* 112 */           return OoiIlOl1iI.I00000oIO;
                }
            }
