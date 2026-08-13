            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class l0olooIII0o {
                public Object I00000oIO(int i) {
/* 5 */             Iooo1oIo iooo1oIoI0001Ioi1lo = I00000oOI().I0001Ioi1lo(i);
/* 22 */            return iooo1oIoI0001Ioi1lo.I0000Il00O.getType().invoke(Integer.valueOf(i - iooo1oIoI0001Ioi1lo.I00000oIO));
                }

                public abstract I00Ol00 I00000oOI();

                public Object I0000Il00O(int i) {
                    Object objInvoke;
/* 5 */             Iooo1oIo iooo1oIoI0001Ioi1lo = I00000oOI().I0001Ioi1lo(i);
/* 11 */            int i2 = i - iooo1oIoI0001Ioi1lo.I00000oIO;
/* 15 */            Function1 key = iooo1oIoI0001Ioi1lo.I0000Il00O.getKey();
                    return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new Ii1ooo(i) : objInvoke;
                }
            }
