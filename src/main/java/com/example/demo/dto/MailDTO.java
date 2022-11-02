/**
 * 
 */
package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alex
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MailDTO {

	private String from;
	private String to;
	private String subject;
	private String message;
	
}
