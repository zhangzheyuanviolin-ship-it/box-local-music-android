            package p000;

            import java.util.LinkedHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            
            public final class I1iIilO0io01 {
                public IIOlO1ii I00000oIO;
                public IIOOoll I00000oOI;
                public Object I0000Il00O;
                public LinkedHashMap I0000O;
                public CopyOnWriteArrayList I0000oI00;

                public final I1iIilil I00000oIO() {
/* 1 */             LinkedHashMap linkedHashMap = this.I0000O;
/* 12 */            if (linkedHashMap.containsValue(I1iIilil.I00000oIO(3))) {
/* 60 */                return I1iIilil.I00000oIO(3);
                    }
                    synchronized (this.I0000Il00O) {
                    }
/* 27 */            if (linkedHashMap.containsValue(I1iIilil.I00000oIO(1))) {
/* 55 */                return I1iIilil.I00000oIO(1);
                    }
                    synchronized (this.I0000Il00O) {
                    }
/* 42 */            if (linkedHashMap.containsValue(I1iIilil.I00000oIO(0))) {
/* 50 */                return I1iIilil.I00000oIO(0);
                    }
                    synchronized (this.I0000Il00O) {
                    }
/* 48 */            return null;
                }
            }
