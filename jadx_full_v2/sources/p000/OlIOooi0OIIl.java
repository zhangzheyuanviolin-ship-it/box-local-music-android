            package p000;

            import java.sql.Timestamp;
            import java.util.Date;
            
            public final class OlIOooi0OIIl extends Ii1ll01O1i {
                public final int I00000oOI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlIOooi0OIIl(int i, Class cls) {
/* 3 */             super(cls);
/* 1 */             this.I00000oOI = i;
                }

                @Override
                public final Date I00000oIO(Date date) {
                    switch (this.I00000oOI) {
                        case 0:
/* 22 */                    return new java.sql.Date(date.getTime());
                        default:
/* 12 */                    return new Timestamp(date.getTime());
                    }
                }
            }
