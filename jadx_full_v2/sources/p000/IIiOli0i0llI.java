            package p000;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.Member;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            
            public final class IIiOli0i0llI extends IIil1l implements II1Oloo00lil {
                public final int I0000oI00;
                public Object I0001Ioi1lo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIiOli0i0llI(Member member, Type type, Class cls, Type[] typeArr, int i) {
/* 3 */             super(member, type, cls, typeArr);
/* 1 */             this.I0000oI00 = i;
                }

                @Override
                public final Object I0000O(Object[] objArr) {
/* 1 */             int i = this.I0000oI00;
/* 3 */             Member member = this.I00000oIO;
                    switch (i) {
                        case 0:
/* 44 */                    I0000oI00(objArr);
/* 52 */                    OlIOOOoi0IlI olIOOOoi0IlI = new OlIOOOoi0IlI(3);
/* 57 */                    olIOOOoi0IlI.I00000oIO(this.I0001Ioi1lo);
/* 60 */                    olIOOOoi0IlI.I00000oOI(objArr);
/* 64 */                    olIOOOoi0IlI.I00000oIO(null);
/* 67 */                    ArrayList arrayList = olIOOOoi0IlI.I00000oIO;
/* 79 */                    return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
                        default:
/* 8 */                     I0000oI00(objArr);
/* 16 */                    OlIOOOoi0IlI olIOOOoi0IlI2 = new OlIOOOoi0IlI(2);
/* 21 */                    olIOOOoi0IlI2.I00000oIO(this.I0001Ioi1lo);
/* 24 */                    olIOOOoi0IlI2.I00000oOI(objArr);
/* 27 */                    ArrayList arrayList2 = olIOOOoi0IlI2.I00000oIO;
/* 39 */                    return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
                    }
                }
            }
