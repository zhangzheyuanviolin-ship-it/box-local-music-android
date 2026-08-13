            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class l00iIoI {
                /* JADX WARN: Multi-variable type inference failed */
                public static IOoil1iiIilo I00000oIO(IOoil1iiIilo iOoil1iiIilo, IOoil1iiIilo iOoil1iiIilo2, IlliIl1l11O illiIl1l11O) {
/* 3 */             if (illiIl1l11O instanceof I1oI1lil) {
/* 7 */                 return ((I1oI1lil) illiIl1l11O).create(iOoil1iiIilo, iOoil1iiIilo2);
                    }
/* 12 */            Ii00l101O context = iOoil1iiIilo2.getContext();
                    return context == Il00o11.I00iOIl ? new O000101lOi(iOoil1iiIilo2, iOoil1iiIilo, illiIl1l11O) : new O000Io11(iOoil1iiIilo2, context, illiIl1l11O, iOoil1iiIilo);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static IOoil1iiIilo I00000oOI(IOoil1iiIilo iOoil1iiIilo, Function1 function1) {
/* 3 */             if (function1 instanceof I1oI1lil) {
/* 7 */                 return ((I1oI1lil) function1).create(iOoil1iiIilo);
                    }
/* 12 */            Ii00l101O context = iOoil1iiIilo.getContext();
                    return context == Il00o11.I00iOIl ? new O000100IIIl(iOoil1iiIilo, function1) : new O0001010l1Ol(iOoil1iiIilo, context, function1);
                }

                public static IOoil1iiIilo I0000Il00O(IOoil1iiIilo iOoil1iiIilo) {
                    IOoil1iiIilo iOoil1iiIiloIntercepted;
/* 9 */             IOoilo iOoilo = iOoil1iiIilo instanceof IOoilo ? (IOoilo) iOoil1iiIilo : null;
                    return (iOoilo == null || (iOoil1iiIiloIntercepted = iOoilo.intercepted()) == null) ? iOoil1iiIilo : iOoil1iiIiloIntercepted;
                }

                public static Object I0000O(IlliIl1l11O illiIl1l11O, Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             Ii00l101O context = iOoil1iiIilo.getContext();
/* 17 */            Object o000OloII0I = context == Il00o11.I00iOIl ? new O000OloII0I(iOoil1iiIilo) : new O000OolO1l(iOoil1iiIilo, context);
/* 22 */            OoOOI1100oI0.I0000Il00O(2, illiIl1l11O);
/* 25 */            return illiIl1l11O.invoke(obj, o000OloII0I);
                }
            }
