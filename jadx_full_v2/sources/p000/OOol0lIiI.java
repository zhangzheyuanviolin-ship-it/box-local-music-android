            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class OOol0lIiI extends IoillO0OOoo {
                public final OOol10IO0O1 I00iiO;

                public OOol0lIiI(OOol10IO0O1 oOol10IO0O1) {
/* 1 */             this.I00iiO = oOol10IO0O1;
                }

                @Override
                public final boolean I000OiO() {
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 1 */             OOol10IO0O1 oOol10IO0O1 = this.I00iiO;
/* 5 */             lII0I0I01I1l.I0000O(i, oOol10IO0O1.I00ilO0);
/* 8 */             Object[] objArr = oOol10IO0O1.I00ilI0I1;
/* 10 */            int i2 = i * 2;
/* 12 */            Object obj = objArr[i2];
/* 14 */            Objects.requireNonNull(obj);
/* 19 */            Object obj2 = objArr[i2 + 1];
/* 21 */            Objects.requireNonNull(obj2);
/* 26 */            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iiO.I00ilO0;
                }
            }
