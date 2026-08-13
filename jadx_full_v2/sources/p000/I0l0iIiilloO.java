            package p000;
            
            public final class I0l0iIiilloO extends Oll0io implements IlliOIilI {
                public int I00iOIl;
                public I0l1I0I0i10I I00iiI;
                public Ii1loIll001 I00iiO;
                public Object I00iio;
                public final I0l1OOl1l10 I00ilI0I1;
                public final I110IiI0o1Il I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0l0iIiilloO(I0l1OOl1l10 i0l1OOl1l10, I110IiI0o1Il i110IiI0o1Il, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(4, iOoil1iiIilo);
/* 1 */             this.I00ilI0I1 = i0l1OOl1l10;
/* 3 */             this.I00ilO0 = i110IiI0o1Il;
                }

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
/* 13 */            I0l0iIiilloO i0l0iIiilloO = new I0l0iIiilloO(this.I00ilI0I1, this.I00ilO0, (IOoil1iiIilo) obj4);
/* 16 */            i0l0iIiilloO.I00iiI = (I0l1I0I0i10I) obj;
/* 18 */            i0l0iIiilloO.I00iiO = (Ii1loIll001) obj2;
/* 20 */            i0l0iIiilloO.I00iio = obj3;
/* 24 */            return i0l0iIiilloO.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 7 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 24 */                I0l1I0I0i10I i0l1I0I0i10I = this.I00iiI;
/* 26 */                Ii1loIll001 ii1loIll001 = this.I00iiO;
/* 28 */                Object obj2 = this.I00iio;
/* 31 */                I0l1OOl1l10 i0l1OOl1l10 = this.I00ilI0I1;
/* 37 */                float fI000II = ((OIooO1iiliI) i0l1OOl1l10.I000lI).I000II();
/* 41 */                this.I00iiI = null;
/* 43 */                this.I00iiO = null;
/* 45 */                this.I00iOIl = 1;
/* 54 */                if (I0l0lIoOIoIi.I0000oI00(i0l1OOl1l10, fI000II, i0l1I0I0i10I, ii1loIll001, obj2, this.I00ilO0, this) == ii0111o) {
/* 56 */                    return ii0111o;
                        }
                    } else {
/* 9 */                 if (i != 1) {
/* 17 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        }
/* 11 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 57 */            return OoiIlOl1iI.I00000oIO;
                }
            }
