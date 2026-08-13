            package p000;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.Member;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Arrays;
            
            public final class IIiOll extends IIil1l {
                public final int I0000oI00;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIiOll(Member member, Type type, Class cls, Type[] typeArr, int i) {
/* 3 */             super(member, type, cls, typeArr);
/* 1 */             this.I0000oI00 = i;
                }

                @Override
                public final Object I0000O(Object[] objArr) {
/* 1 */             int i = this.I0000oI00;
/* 3 */             Member member = this.I00000oIO;
                    switch (i) {
                        case 0:
/* 23 */                    I0000oI00(objArr);
/* 31 */                    OlIOOOoi0IlI olIOOOoi0IlI = new OlIOOOoi0IlI(2);
/* 34 */                    olIOOOoi0IlI.I00000oOI(objArr);
/* 38 */                    olIOOOoi0IlI.I00000oIO(null);
/* 41 */                    ArrayList arrayList = olIOOOoi0IlI.I00000oIO;
/* 53 */                    return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
                        default:
/* 8 */                     I0000oI00(objArr);
/* 18 */                    return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
                    }
                }
            }
