package model.dto;

import java.sql.Date;

public record ProductDto(String pro_name, String product_code, boolean is_deleted, Date imported_at, Date expired_at, String product_description) {
}
