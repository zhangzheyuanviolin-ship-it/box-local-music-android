            package p000;
            
            public enum iI1lI0i implements lOo1Iil {
                UNKNOWN_ERROR(0),
                NO_CONNECTION(1),
                RPC_ERROR(2),
                RPC_RETURNED_MALFORMED_RESULT(3),
                RPC_EXPONENTIAL_BACKOFF_FAILED(5),
                RPC_CLIENT_ERROR(6),
                DIRECTORY_CREATION_FAILED(10),
                FILE_WRITE_FAILED(11),
                FILE_READ_FAILED(12),
                FILE_READ_RETURNED_MALFORMED_DATA(13);

                public final int I00iOIl;

                iI1lI0i(int i) {
/* 4 */             this.I00iOIl = i;
                }

                @Override
                public final int zza() {
/* 1 */             return this.I00iOIl;
                }
            }
