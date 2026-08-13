            package p000;

            import java.util.Arrays;
            import java.util.Comparator;
            
            public final class Ioio10 extends IoilIilo {
                public Comparator I0000oI00;

                public final OOoll01 I000l1() {
                    OOoll01 oOoll01;
/* 1 */             Object[] objArrCopyOf = this.I00000oOI;
/* 3 */             Comparator comparator = this.I0000oI00;
/* 5 */             int i = this.I0000Il00O;
/* 8 */             if (i == 0) {
/* 10 */                oOoll01 = Ioio1ol111i.I0010I0i(comparator);
                    } else {
/* 15 */                l1ioi1lI.I00000oIO(i, objArrCopyOf);
/* 19 */                Arrays.sort(objArrCopyOf, 0, i, comparator);
/* 23 */                int i2 = 1;
/* 24 */                for (int i3 = 1; i3 < i; i3++) {
/* 26 */                    Object obj = objArrCopyOf[i3];
/* 36 */                    if (comparator.compare(obj, objArrCopyOf[i2 - 1]) != 0) {
/* 40 */                        objArrCopyOf[i2] = obj;
/* 38 */                        i2++;
                            }
                        }
/* 47 */                Arrays.fill(objArrCopyOf, i2, i, (Object) null);
/* 53 */                if (i2 < objArrCopyOf.length / 2) {
/* 55 */                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
                        }
/* 65 */                oOoll01 = new OOoll01(IoillO0OOoo.I000lI(i2, objArrCopyOf), comparator);
                    }
/* 75 */            this.I0000Il00O = oOoll01.I00io1l.size();
/* 77 */            this.I0000O = true;
/* 110 */           return oOoll01;
                }
            }
