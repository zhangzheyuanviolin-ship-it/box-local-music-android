            package p000;
            
            public final class OiOoo1 extends Oll0io implements IlliIl1l11O {
                public long I00iOIl;
                public int I00iiI;
                public long I00iiO;
                public final Oii00o1ll I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OiOoo1(Oii00o1ll oii00o1ll, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iio = oii00o1ll;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 5 */             OiOoo1 oiOoo1 = new OiOoo1(this.I00iio, iOoil1iiIilo);
/* 12 */            oiOoo1.I00iiO = ((OooIOilolOo) obj).I00000oIO;
/* 37 */            return oiOoo1;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 19 */            return ((OiOoo1) create(OooIOilolOo.I00000oIO(((OooIOilolOo) obj).I00000oIO), (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    long j;
                    long j2;
                    long j3;
                    long j4;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 8 */             Oii00o1ll oii00o1ll = this.I00iio;
/* 10 */            if (i == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
/* 50 */                j = this.I00iiO;
/* 52 */                OIIII0oOo1o oIIII0oOo1o = oii00o1ll.I0001Ioi1lo;
/* 54 */                this.I00iiO = j;
/* 56 */                this.I00iiI = 1;
/* 58 */                obj = oIIII0oOo1o.I00000oOI(j, this);
/* 62 */                if (obj != ii0111o) {
                        }
/* 110 */               return ii0111o;
                    }
/* 12 */            if (i != 1) {
/* 14 */                if (i != 2) {
/* 16 */                    if (i != 3) {
/* 28 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 18 */                    j4 = this.I00iOIl;
/* 20 */                    j3 = this.I00iiO;
/* 22 */                    lIoii1l01l0i.I00000oOI(obj);
/* 125 */                   return OooIOilolOo.I00000oIO(OooIOilolOo.I0000oI00(j3, OooIOilolOo.I0000oI00(j4, ((OooIOilolOo) obj).I00000oIO)));
                        }
/* 33 */                j2 = this.I00iOIl;
/* 35 */                j = this.I00iiO;
/* 37 */                lIoii1l01l0i.I00000oOI(obj);
/* 89 */                long j5 = ((OooIOilolOo) obj).I00000oIO;
/* 91 */                OIIII0oOo1o oIIII0oOo1o2 = oii00o1ll.I0001Ioi1lo;
/* 93 */                long jI0000oI00 = OooIOilolOo.I0000oI00(j2, j5);
/* 97 */                this.I00iiO = j;
/* 99 */                this.I00iOIl = j5;
/* 101 */               this.I00iiI = 3;
/* 104 */               obj = oIIII0oOo1o2.I00000oIO(jI0000oI00, j5, this);
/* 108 */               if (obj != ii0111o) {
/* 111 */                   j3 = j;
/* 112 */                   j4 = j5;
/* 125 */                   return OooIOilolOo.I00000oIO(OooIOilolOo.I0000oI00(j3, OooIOilolOo.I0000oI00(j4, ((OooIOilolOo) obj).I00000oIO)));
                        }
/* 110 */               return ii0111o;
                    }
/* 41 */            j = this.I00iiO;
/* 43 */            lIoii1l01l0i.I00000oOI(obj);
/* 69 */            long jI0000oI002 = OooIOilolOo.I0000oI00(j, ((OooIOilolOo) obj).I00000oIO);
/* 73 */            this.I00iiO = j;
/* 75 */            this.I00iOIl = jI0000oI002;
/* 77 */            this.I00iiI = 2;
/* 79 */            obj = oii00o1ll.I00000oIO(jI0000oI002, this);
/* 83 */            if (obj != ii0111o) {
/* 86 */                j2 = jI0000oI002;
/* 89 */                long j52 = ((OooIOilolOo) obj).I00000oIO;
/* 91 */                OIIII0oOo1o oIIII0oOo1o22 = oii00o1ll.I0001Ioi1lo;
/* 93 */                long jI0000oI003 = OooIOilolOo.I0000oI00(j2, j52);
/* 97 */                this.I00iiO = j;
/* 99 */                this.I00iOIl = j52;
/* 101 */               this.I00iiI = 3;
/* 104 */               obj = oIIII0oOo1o22.I00000oIO(jI0000oI003, j52, this);
/* 108 */               if (obj != ii0111o) {
                        }
                    }
/* 110 */           return ii0111o;
                }
            }
