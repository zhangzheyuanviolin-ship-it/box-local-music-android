            package p000;

            import java.io.IOException;
            import java.lang.reflect.Array;
            import java.util.ArrayList;
            
            public final class I1IoI0o1 extends OoO00O1IiOl {
                public static final I1Io1oi I0000Il00O = new I1Io1oi();
                public Class I00000oIO;
                public O00o1oIoiO I00000oOI;

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
/* 1 */             Class cls = this.I00000oIO;
/* 9 */             if (o01loll1loll.peek() == 9) {
/* 11 */                o01loll1loll.I00ioIO();
/* 14 */                return null;
                    }
/* 18 */            ArrayList arrayList = new ArrayList();
/* 21 */            o01loll1loll.I00000oIO();
/* 28 */            while (o01loll1loll.I00IOO()) {
/* 38 */                arrayList.add(this.I00000oOI.I0000Il00O.I00000oOI(o01loll1loll));
                    }
/* 42 */            o01loll1loll.I000l1();
/* 45 */            int size = arrayList.size();
/* 53 */            if (!cls.isPrimitive()) {
/* 79 */                return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                    }
/* 55 */            Object objNewInstance = Array.newInstance((Class<?>) cls, size);
/* 60 */            for (int i = 0; i < size; i++) {
/* 66 */                Array.set(objNewInstance, i, arrayList.get(i));
                    }
/* 72 */            return objNewInstance;
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
/* 1 */             if (obj == null) {
/* 3 */                 o01ooi1IIiiO.I00IOO();
/* 6 */                 return;
                    }
/* 7 */             o01ooi1IIiiO.I0000Il00O();
/* 10 */            int length = Array.getLength(obj);
/* 15 */            for (int i = 0; i < length; i++) {
/* 23 */                this.I00000oOI.I0000Il00O(o01ooi1IIiiO, Array.get(obj, i));
                    }
/* 29 */            o01ooi1IIiiO.I000l1();
                }
            }
