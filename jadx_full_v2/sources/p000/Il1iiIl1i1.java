            package p000;

            import android.view.KeyEvent;
            import kotlin.jvm.functions.Function1;
            
            public final class Il1iiIl1i1 implements Function1 {
                public String I00iOIl;
                public Il1iOloo I00iiI;
                public boolean I00iiO;
                public OI10i0Il I00iio;

                @Override
                public final Object invoke(Object obj) throws Exception {
/* 3 */             KeyEvent keyEvent = ((O0O1l0ilO) obj).I00000oIO;
/* 5 */             OI10i0Il oI10i0Il = this.I00iio;
/* 7 */             Il1iOloo il1iOloo = this.I00iiI;
/* 9 */             String str = this.I00iOIl;
/* 18 */            if (l0iloO.I00000oOI(keyEvent) == 1 && (ilIoOii1l.I00000oOI(keyEvent) || O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I00100o1O0lo))) {
/* 46 */                if (!str.equals("PrimaryEditable")) {
/* 48 */                    il1iOloo.invoke();
                        } else if (ilIoOii1l.I00000oOI(keyEvent)) {
/* 58 */                    il1iOloo.invoke();
/* 61 */                    return Boolean.TRUE;
                        }
                    }
/* 68 */            if (str.equals("PrimaryEditable") && this.I00iiO && (O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I00100l0) || O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I0000oI00) || O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I00IO1oi11O) || O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I0000O) || O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I00IO1))) {
/* 154 */               Boolean bool = Boolean.TRUE;
/* 156 */               oI10i0Il.setValue(bool);
/* 159 */               return bool;
                    }
/* 160 */           Boolean bool2 = Boolean.FALSE;
/* 162 */           oI10i0Il.setValue(bool2);
/* 168 */           return bool2;
                }
            }
