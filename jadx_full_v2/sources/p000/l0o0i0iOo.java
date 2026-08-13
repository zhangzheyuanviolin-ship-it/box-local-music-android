            package p000;
            
            public abstract class l0o0i0iOo {
                public static final int I00000oIO(O1IiO0l o1IiO0l, I0iolili01 i0iolili01) {
/* 1 */             O1IiO0l o1IiO0lI00o0iI0io1 = o1IiO0l.I00o0iI0io1();
/* 5 */             if (o1IiO0lI00o0iI0io1 == null) {
/* 27 */                IolioOO1.I0000Il00O("Child of " + o1IiO0l + " cannot be null when calculating alignment line");
                    }
/* 44 */            if (o1IiO0l.I00ooIo0().I00000oOI().containsKey(i0iolili01)) {
/* 58 */                Integer num = (Integer) o1IiO0l.I00ooIo0().I00000oOI().get(i0iolili01);
/* 60 */                if (num != null) {
/* 62 */                    return num.intValue();
                        }
                    } else {
/* 67 */                int iI00OilO00Il = o1IiO0lI00o0iI0io1.I00OilO00Il(i0iolili01);
/* 71 */                if (iI00OilO00Il != Integer.MIN_VALUE) {
/* 74 */                    boolean z = o1IiO0l.I00lll10;
/* 76 */                    boolean z2 = o1IiO0l.I00o0iI0io1;
/* 79 */                    o1IiO0lI00o0iI0io1.I00lll10 = true;
/* 81 */                    o1IiO0l.I00o0iI0io1 = true;
/* 83 */                    o1IiO0l.I010I0();
/* 86 */                    o1IiO0lI00o0iI0io1.I00lll10 = z;
/* 88 */                    o1IiO0l.I00o0iI0io1 = z2;
/* 105 */                   return iI00OilO00Il + ((int) (i0iolili01 instanceof IoI110lO0O ? o1IiO0lI00o0iI0io1.I00oooO() & 4294967295L : o1IiO0lI00o0iI0io1.I00oooO() >> 32));
                        }
                    }
/* 42 */            return Integer.MIN_VALUE;
                }
            }
