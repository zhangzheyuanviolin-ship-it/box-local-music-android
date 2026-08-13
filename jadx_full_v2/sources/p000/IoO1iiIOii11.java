            package p000;
            
            public final class IoO1iiIOii11 extends Oll0io implements IlliOIilI {
                public IoO10oI0o I00iOIl;
                public final int I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoO1iiIOii11(int i, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(4, iOoil1iiIilo);
/* 1 */             this.I00iiI = i;
                }

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
/* 11 */            IoO1iiIOii11 ioO1iiIOii11 = new IoO1iiIOii11(this.I00iiI, (IOoil1iiIilo) obj4);
/* 14 */            ioO1iiIOii11.I00iOIl = (IoO10oI0o) obj2;
/* 16 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 18 */            ioO1iiIOii11.invokeSuspend(ooiIlOl1iI);
/* 483 */           return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             IoO10oI0o ioO10oI0o = this.I00iOIl;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 8 */             IOlOl10 iOlOl10 = ioO10oI0o.I0001Ioi1lo;
/* 10 */            I1OoollI1Il1 i1OoollI1Il1 = IoO1lI1l.I0000Il00O;
/* 16 */            Integer num = (Integer) iOlOl10.I0000O(i1OoollI1Il1);
/* 34 */            ioO10oI0o.I0001Ioi1lo.I0000oI00(i1OoollI1Il1, new Integer(num != null ? num.intValue() : this.I00iiI));
/* 37 */            return OoiIlOl1iI.I00000oIO;
                }
            }
