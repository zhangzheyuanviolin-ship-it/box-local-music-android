            package p000;
            
            public final class OoiI0oiiIo extends Oll0io implements IlliOIilI {
                public int I00iOIl;
                public Throwable I00iiI;
                public long I00iiO;

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
/* 7 */             long jLongValue = ((Number) obj3).longValue();
/* 16 */            OoiI0oiiIo ooiI0oiiIo = new OoiI0oiiIo(4, (IOoil1iiIilo) obj4);
/* 19 */            ooiI0oiiIo.I00iiI = (Throwable) obj2;
/* 21 */            ooiI0oiiIo.I00iiO = jLongValue;
/* 25 */            return ooiI0oiiIo.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 24 */                Throwable th = this.I00iiI;
/* 26 */                long j = this.I00iiO;
/* 36 */                IIi0oIl.I000II().I0001Ioi1lo(OoiI111i1l1O.I00000oIO, "Cannot check for unfinished work", th);
/* 44 */                long jMin = Math.min(j * 30000, OoiI111i1l1O.I00000oOI);
/* 48 */                this.I00iOIl = 1;
/* 54 */                if (il0l1o1l.I00000oOI(jMin, this) == ii0111o) {
/* 56 */                    return ii0111o;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 57 */            return Boolean.TRUE;
                }
            }
