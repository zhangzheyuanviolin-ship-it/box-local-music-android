            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class iOl1iOi0I {
                public static IIIII1OI1 I00000oIO(int i, IIII0i iIII0i, Function1 function1, int i2) {
/* 4 */             if ((i2 & 1) != 0) {
/* 6 */                 i = 0;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                iIII0i = IIII0i.I00iOIl;
                    }
/* 16 */            if ((i2 & 4) != 0) {
/* 18 */                function1 = null;
                    }
/* 21 */            if (i == -2) {
/* 91 */                if (iIII0i != IIII0i.I00iOIl) {
/* 108 */                   return new IOlo0O1oi0(1, iIII0i, function1);
                        }
/* 97 */                IO1010.I000iOII.getClass();
/* 102 */               return new IIIII1OI1(IO100o11.I00000oOI, function1);
                    }
/* 24 */            if (i != -1) {
                        return i != 0 ? i != Integer.MAX_VALUE ? iIII0i == IIII0i.I00iOIl ? new IIIII1OI1(i, function1) : new IOlo0O1oi0(i, iIII0i, function1) : new IIIII1OI1(Integer.MAX_VALUE, function1) : iIII0i == IIII0i.I00iOIl ? new IIIII1OI1(0, function1) : new IOlo0O1oi0(1, iIII0i, function1);
                    }
/* 73 */            if (iIII0i == IIII0i.I00iOIl) {
/* 79 */                return new IOlo0O1oi0(1, IIII0i.I00iiI, function1);
                    }
/* 85 */            I000II.I000iOII("CONFLATED capacity cannot be used with non-default onBufferOverflow");
/* 15 */            return null;
                }
            }
