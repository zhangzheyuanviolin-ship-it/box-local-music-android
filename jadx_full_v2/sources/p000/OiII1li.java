            package p000;

            import android.database.Cursor;
            import java.lang.invoke.VarHandle;
            
            public final class OiII1li implements OiIIOlilOlo {
                public long I00iOIl;

                @Override
                public final Object apply(Object obj) {
/* 1 */             long j = this.I00iOIl;
/* 3 */             Cursor cursor = (Cursor) obj;
/* 5 */             cursor.moveToNext();
/* 9 */             long j2 = cursor.getLong(0);
/* 15 */            Oo11I1IO oo11I1IO = new Oo11I1IO();
/* 18 */            oo11I1IO.I00000oIO = j2;
/* 20 */            oo11I1IO.I00000oOI = j;
/* 22 */            VarHandle.storeStoreFence();
/* 29 */            return oo11I1IO;
                }
            }
