            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public abstract class lIl1l1IolOi {
                public static OOo1OIIIO I00000oIO(OI1Iio0ii1 oI1Iio0ii1, Object obj) {
/* 1 */             Class<?> cls = obj.getClass();
/* 5 */             List list = OOo1Io0I0.I00000oIO;
/* 13 */            if (Enum.class.isAssignableFrom(cls)) {
/* 19 */                OOoII1 oOoII1 = new OOoII1(oI1Iio0ii1);
/* 22 */                oOoII1.I00000oOI = (Enum) obj;
/* 24 */                VarHandle.storeStoreFence();
/* 27 */                return oOoII1;
                    }
/* 30 */            if (obj instanceof Annotation) {
/* 36 */                OOo1OOOoOI oOo1OOOoOI = new OOo1OOOoOI(oI1Iio0ii1);
/* 39 */                oOo1OOOoOI.I00000oOI = (Annotation) obj;
/* 41 */                VarHandle.storeStoreFence();
/* 44 */                return oOo1OOOoOI;
                    }
/* 47 */            if (obj instanceof Object[]) {
/* 53 */                OOo1i0i oOo1i0i = new OOo1i0i(oI1Iio0ii1);
/* 56 */                oOo1i0i.I00000oOI = (Object[]) obj;
/* 58 */                VarHandle.storeStoreFence();
/* 61 */                return oOo1i0i;
                    }
/* 64 */            if (obj instanceof Class) {
/* 70 */                OOoI01o1O00 oOoI01o1O00 = new OOoI01o1O00(oI1Iio0ii1);
/* 73 */                oOoI01o1O00.I00000oOI = (Class) obj;
/* 75 */                VarHandle.storeStoreFence();
/* 78 */                return oOoI01o1O00;
                    }
/* 81 */            OOoIOII01o1 oOoIOII01o1 = new OOoIOII01o1(oI1Iio0ii1);
/* 84 */            oOoIOII01o1.I00000oOI = obj;
/* 86 */            VarHandle.storeStoreFence();
/* 89 */            return oOoIOII01o1;
                }
            }
